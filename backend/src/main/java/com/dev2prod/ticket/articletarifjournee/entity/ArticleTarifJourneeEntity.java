package com.dev2prod.ticket.articletarifjournee.entity;

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
@Table(name = "T_Article_Tarif_Journee")
public class ArticleTarifJourneeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTarifJournee")
    private Integer idTarifJournee;

    @Column(name = "idArticle")
    private Integer idArticle;

    @Column(name = "idJournee")
    private Integer idJournee;

    @Column(name = "PrixUnitaireHT")
    private Float prixUnitaireHT;

    @Column(name = "PrixUnitaireTTC")
    private Float prixUnitaireTTC;

    @Column(name = "TarifHeure")
    private Integer tarifHeure;

    @Column(name = "HeureValidite")
    private String heureValidite;

    @Column(name = "PrixUnitaireHTHeure")
    private Float prixUnitaireHTHeure;

    @Column(name = "PrixUnitaireTTCHeure")
    private Float prixUnitaireTTCHeure;

    @Column(name = "idModeleImpression")
    private Integer idModeleImpression;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
