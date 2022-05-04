package br.com.consultorio.repository;

import br.com.consultorio.entity.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
}
