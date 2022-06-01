package br.com.consultorio.repository;

import br.com.consultorio.entity.Agenda;
import br.com.consultorio.entity.Medico;
import br.com.consultorio.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
    @Modifying
    @Query("UPDATE Agenda agenda " +
            "SET agenda.ativo = false " +
            "WHERE agenda.id = :idAgenda")
    public void desativar(@Param("idAgenda") Long idAgenda);

    @Query("FROM Agenda agenda " +
            "WHERE 1=1 " +
            "   AND (" +
            "       :dataDe BETWEEN agenda.dataDe AND agenda.dataAte " +
            "       OR " +
            "       :dataAte BETWEEN agenda.dataDe AND agenda.dataAte" +
            "   ) " +
            "   AND (" +
            "       :medico = agenda.medico " +
            "       OR " +
            "       :paciente = agenda.paciente" +
            "   ) " +
            "   AND :agenda <> agenda " +
            "   AND agenda.ativo = true ")

    public List<Agenda> agendasConflitoHorariosMedico(
            @Param("agenda") Agenda agenda,
            @Param("dataDe") LocalDateTime localDateTimeDe,
            @Param("dataAte") LocalDateTime localDateTimeAte,
            @Param("medico") Medico medico,
            @Param("paciente") Paciente paciente);

}
