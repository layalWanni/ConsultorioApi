package br.com.consultorio.repository;

import br.com.consultorio.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> { }
