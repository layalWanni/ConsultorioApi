package br.com.consultorio.repository;

import br.com.consultorio.entity.Especialidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {

    @Modifying
    @Query("UPDATE Especialidade especialidade " +
            "SET especialidade.excluido = :excluido " +
            "WHERE especialidade.id = :especialidade")
    public void updateDataExcluido(@Param("excluido") LocalDateTime excluido, @Param("especialidade") Long idEspecialidade);

}
