package br.com.consultorio.repository;

import br.com.consultorio.entity.Especialidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {

    @Modifying
    @Query("UPDATE Especialidade especialidade " +
            "SET especialidade.ativo = true " +
            "WHERE especialidade.id = :idEspecialidade")
    public void desativar(@Param("idEspecialidade") Long idEspecialidade);

}
