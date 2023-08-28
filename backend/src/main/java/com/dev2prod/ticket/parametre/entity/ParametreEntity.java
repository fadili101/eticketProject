package com.dev2prod.ticket.parametre.entity;

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
@Table(name = "P_Parametre")
public class ParametreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idParametre")
    private Integer idParametre;

    @Column(name = "Indice")
    private Integer indice;

    @Column(name = "Parametre")
    private String parametre;

    @Column(name = "TypeParametre")
    private Integer typeParametre;

    @Column(name = "NPieceInitialiser")
    private Integer nPieceInitialiser;

    @Column(name = "NPieceFormat")
    private String nPieceFormat;

    @Column(name = "NPieceCaractere")
    private String nPieceCaractere;

    @Column(name = "NPieceLongueur")
    private Integer nPieceLongueur;

    @Column(name = "TypeSalarie")
    private Integer typeSalarie;

    @Column(name = "Valeur")
    private Float valeur;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
