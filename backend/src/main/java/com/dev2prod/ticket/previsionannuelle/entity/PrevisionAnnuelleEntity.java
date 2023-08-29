package com.dev2prod.ticket.previsionannuelle.entity;

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
@Table(name = "P_Prevision_Annuelle")
public class PrevisionAnnuelleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idLigne")
    private Integer idLigne;

    @Column(name = "Mois")
    private Integer mois;

    @Column(name = "Annee")
    private Integer annee;

    @Column(name = "idArticle")
    private Integer idArticle;

    @Column(name = "RefArticle")
    private String refArticle;

    @Column(name = "Designation")
    private String designation;

    @Column(name = "QteVendue")
    private Float qteVendue;

    @Column(name = "NombrePersonne")
    private Integer nombrePersonne;

    @Column(name = "TotalPersonne")
    private Long totalPersonne;

    @Column(name = "PU_TTC")
    private Float puTTC;

    @Column(name = "CA_TTC")
    private Float caTTC;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
