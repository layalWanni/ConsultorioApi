package br.com.consultorio.service;

import br.com.consultorio.entity.Agenda;
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
    public void updateDataExcluido(Long id, Agenda agenda){
        if (id == agenda.getId()) {
            this.agendaRepository.updateDataExcluido(LocalDateTime.now(),agenda.getId());
        }
        else {
            throw new RuntimeException();
        }
    }

}
