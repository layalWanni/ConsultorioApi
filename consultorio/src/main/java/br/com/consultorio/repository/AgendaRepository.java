package br.com.consultorio.repository;

import br.com.consultorio.entity.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
    @Modifying
    @Query("UPDATE Agenda agenda " +
            "SET agenda.excluido = :excluido " +
            "WHERE agenda.id = :agenda")
    public void updateDataExcluido(@Param("excluido") LocalDateTime excluido, @Param("agenda") Long idAgenda);

}
