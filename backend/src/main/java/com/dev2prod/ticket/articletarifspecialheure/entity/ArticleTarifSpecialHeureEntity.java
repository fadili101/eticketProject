package com.dev2prod.ticket.articletarifspecialheure.entity;

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
@Table(name = "T_Article_Tarif_Special_Heure")
public class ArticleTarifSpecialHeureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTarif_heure")
    private Long idTarifHeure;

    @Column(name = "idTarif")
    private Long idTarif;

    @Column(name = "idArticle")
    private Integer idArticle;

    @Column(name = "idJournee")
    private Integer idJournee;

    @Column(name = "HeureValiditeDebut")
    private String heureValiditeDebut;

    @Column(name = "PrixUnitaireHT")
    private Float prixUnitaireHT;

    @Column(name = "PrixUnitaireTTC")
    private Float prixUnitaireTTC;

    @Column(name = "TarifHeure")
    private Integer tarifHeure;

    @Column(name = "PrixUnitaireHTHeure")
    private Float prixUnitaireHTHeure;

    @Column(name = "PrixUnitaireTTCHeure")
    private Float prixUnitaireTTCHeure;

    @Column(name = "Flag_Delete")
    private Integer flagDelete;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
