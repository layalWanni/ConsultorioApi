package br.com.consultorio.controller;

import br.com.consultorio.entity.Agenda;
import br.com.consultorio.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/agenda")
public class AgendaController {
//
//    @Autowired
//    private AgendaService agendaService;
//
//    @GetMapping("/{idAgenda}")
//    public ResponseEntity<Agenda> findById(
//            @PathVariable("idAgenda") Long idAgenda
//    ){
//        return ResponseEntity.ok().body(
//                this.agendaService.findById(idAgenda).get());
//    }
//
//    @GetMapping
//    public ResponseEntity<Page<Agenda>> listByAllPages(Pageable pageable){
//        return ResponseEntity.ok().body(this.agendaService.listAll(pageable));
//    }
//
//
//    @PostMapping
//    public ResponseEntity<?> insert(@RequestBody Agenda agenda) {
//        try {
//            this.agendaService.insert(agenda);
//            return ResponseEntity.ok().body("Agenda Cadastrada com Sucesso");
//        } catch (RuntimeException e) {
//            return ResponseEntity.badRequest().body(e.getMessage());
//        }
//    }
//
//    @PutMapping("/{idAgenda}")
//    public ResponseEntity<?> update(
//            @RequestBody Agenda agenda,
//            @PathVariable Long idAgenda) {
//        try {
//            this.agendaService.update(idAgenda ,agenda);
//            return ResponseEntity.ok().body("Agenda Atualizada com Sucesso");
//        } catch (RuntimeException e) {
//            return ResponseEntity.badRequest().body(e.getMessage());
//        }
//    }
//
//    @PutMapping("/status/{idAgenda}")
//    public ResponseEntity<?> updateStatus(
//            @RequestBody Agenda agenda,
//            @PathVariable Long idAgenda) {
//        try {
//            this.agendaService.updateDataExcluido(idAgenda ,agenda);
//            return ResponseEntity.ok().body("Agenda Desativada com Sucesso");
//        } catch (RuntimeException e) {
//            return ResponseEntity.badRequest().body(e.getMessage());
//        }
//    }
}
