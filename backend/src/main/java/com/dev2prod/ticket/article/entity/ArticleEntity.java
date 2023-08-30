package com.dev2prod.ticket.article.entity;

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
@Table(name = "T_Article")
public class ArticleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idArticle")
    private Integer idArticle;

    @Column(name = "idFamille")
    private Integer idFamille;

    @Column(name = "RefArticle")
    private String refArticle;

    @Column(name = "Designation")
    private String designation;

    @Column(name = "idSuiviStock")
    private Integer idSuiviStock;

    @Column(name = "PrixUnitaireHT")
    private Double prixUnitaireHT;

    @Column(name = "PrixUnitaireTTC")
    private Double prixUnitaireTTC;

    @Column(name = "idTauxTVA")
    private Integer idTauxTVA;

    @Column(name = "TypeArticle")
    private Integer typeArticle;

    @Column(name = "Flag_Delete")
    private Integer flagDelete;

    @Column(name = "idModeleImpression")
    private Integer idModeleImpression;

    @Column(name = "CodeBarre")
    private String codeBarre;

    @Column(name = "Abrege")
    private String abrege;

    @Column(name = "QteMin")
    private Double qteMin;

    @Column(name = "TypeImpression")
    private Integer typeImpression;

    @Column(name = "TypeFacture")
    private Integer typeFacture;

    @Column(name = "TypeAcces")
    private Integer typeAcces;

    @Column(name = "CompteComptable")
    private String compteComptable;

    @Column(name = "TauxTVA")
    private Double tauxTVA;

    @Column(name = "CodeJournal")
    private String codeJournal;

    @Column(name = "AffichageCaisse")
    private Boolean affichageCaisse;

    @Column(name = "NatureAcces")
    private Integer natureAcces;

    @Column(name = "ImprimerCBBillet")
    private Boolean imprimerCBBillet;

    @Column(name = "NombrePersonne")
    private Integer nombrePersonne;

    @Column(name = "LibelleEcriture")
    private String libelleEcriture;

    @Column(name = "CategorieProduit")
    private Integer categorieProduit;

    @Column(name = "NatureProduit")
    private Integer natureProduit;

    @Column(name = "CategorieSocioProf")
    private Integer categorieSocioProf;

    @Column(name = "PrixUnitaireAchat")
    private Double prixUnitaireAchat;

    @Column(name = "CategoriePersonne")
    private Integer categoriePersonne;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
