package br.com.consultorio.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@NoArgsConstructor

public abstract class AbstractEntity {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Long id;

    @Getter @Setter
    @Column(name = "cadastro", nullable = false)
    private LocalDateTime cadastro;

    @Getter @Setter
    @Column(name = "atualizado")
    private LocalDateTime atualizado;

    @Getter @Setter
    @Column(name = "excluido")
    private LocalDateTime ativo;

    public AbstractEntity(Long id){
        this.id = id;
    }

    @PrePersist
    public void dataCadastro(){
        this.cadastro = LocalDateTime.now();
    }

    @PreUpdate
    public void dataAtualizacao(){
        this.atualizado = LocalDateTime.now();
    }

}
