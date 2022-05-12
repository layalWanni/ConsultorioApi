package br.com.consultorio.service;

import br.com.consultorio.entity.Agenda;
import br.com.consultorio.entity.Paciente;
import br.com.consultorio.entity.TipoAtendimento;
import br.com.consultorio.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    public Optional<Agenda> findById(Long id){
        return this.agendaRepository.findById(id);
    }
    public Page<Agenda> listAll(Pageable pageable){
        return this.agendaRepository.findAll(pageable);
    }

    @Transactional
    public void saveTransactional(Agenda agenda){
        this.agendaRepository.save(agenda);
    }

    public void insert(Agenda agenda){
        this.validarAgenda(agenda);
        this.saveTransactional(agenda);
    }

    @Transactional
    public void updateDataExcluido(Long id, Agenda agenda){
        if (id == agenda.getId()) {
            this.agendaRepository.updateDataExcluido(LocalDateTime.now(),agenda.getId());
        }
        else {
            throw new RuntimeException();
        }
    }


    public void validarAgenda(Agenda agenda){

            if (agenda.getData().compareTo(LocalDateTime.now()) <= 0){
                throw new RuntimeException("Data de Agendamento nao valido.");
            }
            if (agenda.getData() == null){
                throw new RuntimeException("Data nao informada.");
            }
            if (agenda.getEncaixe() == null){
                throw new RuntimeException("Encaixe nao informado");
            }
            if (agenda.getMedico() == null){
                throw new RuntimeException("Informe um Medico para o Agendamento");
            }
            if (agenda.getPaciente() == null){
                throw new RuntimeException("Informe um Paciente para o Agendamento");
            }
            if (agenda.getStatusAgenda() == null){
                throw new RuntimeException("Infome um status para o Agendamento");
            }
    }


}


