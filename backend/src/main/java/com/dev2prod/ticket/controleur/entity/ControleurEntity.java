package com.dev2prod.ticket.controleur.entity;

import java.time.LocalDateTime;

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
@Table(name = "P_Controleur", schema = "dbo")
public class ControleurEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idControleur")
    private Integer idControleur;

    @Column(name = "ControleurNum", length = 50)
    private String controleurNum;

    @Column(name = "AdresseIP", length = 50)
    private String adresseIP;

    @Column(name = "Marque", length = 50)
    private String marque;

    @Column(name = "Fournisseur", length = 50)
    private String fournisseur;

    @Column(name = "timeUpdate")
    private LocalDateTime timeUpdate;

    @Column(name = "derniereOp", length = 10)
    private String derniereOp;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
