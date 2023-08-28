package com.dev2prod.ticket.champcomptable.entity;

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
@Table(name = "P_ChampComptable", schema = "dbo")
public class ChampComptableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idChamp")
    private Integer idChamp;

    @Column(name = "NomChamp", length = 50)
    private String nomChamp;

    @Column(name = "Longueur")
    private Integer longueur;

    @Column(name = "LigneSage")
    private Integer ligneSage;

    @Column(name = "ChampMAJ", length = 50)
    private String champMAJ;

    @Column(name = "ValeurAnomalie", length = 50)
    private String valeurAnomalie;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
