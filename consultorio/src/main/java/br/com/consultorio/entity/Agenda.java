package br.com.consultorio.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "agendas", schema = "public")
@NoArgsConstructor

public class Agenda extends AbstractEntity{

    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StatusAgenda statusAgenda;

    @Getter @Setter
    @Column(name = "data", nullable = false)
    private LocalDateTime data;

    @Getter @Setter
    @Column(name = "encaixe",columnDefinition = "BOOLEAN DEFAULT TRUE",nullable = false)
    private Boolean encaixe;

    @Getter @Setter
    @JoinColumn(name = "id_paciente", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Paciente paciente;

    @Getter @Setter
    @JoinColumn(name = "id_medico", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Medico medico;

}