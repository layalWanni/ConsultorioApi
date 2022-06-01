package br.com.consultorio.repository;

import br.com.consultorio.entity.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    @Modifying
    @Query("UPDATE Medico medico " +
            "SET medico.ativo = :true " +
            "WHERE medico.id = :idMedico")
    public void desativar(@Param("idMedico") Long idMedico);

}
