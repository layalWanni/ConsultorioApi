package br.com.consultorio.repository;

import br.com.consultorio.entity.Historico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricoRepository extends JpaRepository<Historico, Long> {
}
