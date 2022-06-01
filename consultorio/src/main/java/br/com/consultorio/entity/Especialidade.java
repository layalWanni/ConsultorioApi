package br.com.consultorio.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "especialidades", schema = "public")
@NoArgsConstructor

public class Especialidade extends AbstractEntity {
    @Getter @Setter
    @Column(name = "nome", nullable = false, unique = true, length = 50)
    private String nome;
}
