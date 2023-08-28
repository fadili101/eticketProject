package com.dev2prod.ticket.guichet.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "P_Guichet", schema = "dbo")
public class GuichetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGuichet")
    private Integer idGuichet;

    @Column(name = "Guichet")
    private String guichet;

    @Column(name = "NomMachine")
    private String nomMachine;

}
