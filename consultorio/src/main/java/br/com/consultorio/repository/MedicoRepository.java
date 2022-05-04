package br.com.consultorio.repository;

import br.com.consultorio.entity.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    @Modifying
    @Query("UPDATE Medico medico " +
            "SET medico.excluido = :excluido " +
            "WHERE medico.id = :medico")
    public void updateDataExcluido(@Param("excluido") LocalDateTime excluido, @Param("medico") Long idMedico);

}
