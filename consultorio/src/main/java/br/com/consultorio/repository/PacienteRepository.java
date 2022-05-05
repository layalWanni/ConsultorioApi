package br.com.consultorio.repository;

import br.com.consultorio.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    @Modifying
    @Query("UPDATE Paciente paciente " +
            "SET paciente.excluido = :excluido " +
            "WHERE paciente.id = :paciente")
    public void updateDataExcluido(@Param("excluido") LocalDateTime excluido, @Param("paciente") Long idPaciente);

}
