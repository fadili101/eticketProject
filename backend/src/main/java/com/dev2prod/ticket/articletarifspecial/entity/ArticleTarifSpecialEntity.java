package com.dev2prod.ticket.articletarifspecial.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "T_Article_Tarif_Special")
public class ArticleTarifSpecialEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTarif")
    private Long idTarif;

    @Column(name = "idArticle")
    private Integer idArticle;

    @Column(name = "Designation")
    private String designation;

    @Column(name = "PrixUnitaireHT")
    private Float prixUnitaireHT;

    @Column(name = "PrixUnitaireTTC")
    private Float prixUnitaireTTC;

    @Column(name = "TypeTarif")
    private Integer typeTarif;

    @Column(name = "DateDebut")
    private LocalDateTime dateDebut;

    @Column(name = "DateFin")
    private LocalDateTime dateFin;

    @Column(name = "Priorite")
    private Integer priorite;

    @Column(name = "Flag_Delete")
    private Integer flagDelete;

    @Column(name = "idModeleImpression")
    private Integer idModeleImpression;

    @Column(name = "CompteComptable")
    private String compteComptable;

    @Column(name = "CodeJournal")
    private String codeJournal;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
