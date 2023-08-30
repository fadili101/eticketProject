package com.dev2prod.ticket.articletarifclient.entity;

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
@Table(name = "T_Article_Tarif_Client")
public class ArticleTarifClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTarifClient")
    private Integer idTarifClient;

    @Column(name = "idArticle")
    private Integer idArticle;

    @Column(name = "idTypeTarifClient")
    private Integer idTypeTarifClient;

    @Column(name = "idClient")
    private Integer idClient;

    @Column(name = "idTypeClient")
    private Integer idTypeClient;

    @Column(name = "PrixUnitaireHT")
    private Float prixUnitaireHT;

    @Column(name = "PrixUnitaireTTC")
    private Float prixUnitaireTTC;

    @Column(name = "idModeleImpression")
    private Integer idModeleImpression;

    @Column(name = "Flag_Delete")
    private Integer flagDelete;

    @Column(name = "CompteComptable")
    private String compteComptable;

    @Column(name = "CodeJournal")
    private String codeJournal;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
