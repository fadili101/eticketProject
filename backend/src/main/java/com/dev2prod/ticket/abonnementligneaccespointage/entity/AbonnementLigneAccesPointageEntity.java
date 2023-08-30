package com.dev2prod.ticket.abonnementligneaccespointage.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "T_Abonnement_Ligne_Acces_Pointage")
public class AbonnementLigneAccesPointageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAbonnementLigneAccesPointage")
    private Long idAbonnementLigneAccesPointage;

    @Column(name = "idAbonnementLigneAcces")
    private Long idAbonnementLigneAcces;

    @Column(name = "idAbonnementLigne")
    private Long idAbonnementLigne;

    @Column(name = "idAbonnement")
    private Long idAbonnement;

    @Column(name = "idArticleComposition")
    private Integer idArticleComposition;

    @Column(name = "idArticleCompose")
    private Integer idArticleCompose;

    @Column(name = "TypeAcces")
    private Integer typeAcces;

    @Column(name = "Designation")
    private String designation;

    @Column(name = "DateDebuteValidtite")
    private Date dateDebuteValidtite;

    @Column(name = "DateFinValidtite")
    private Date dateFinValidtite;

    @Column(name = "CodeBarreAcces")
    private String codeBarreAcces;

    @Column(name = "StautAcces")
    private Integer stautAcces;

    @Column(name = "TypeValidation")
    private Integer typeValidation;

    @Column(name = "idTourniquet")
    private Integer idTourniquet;

    @Column(name = "idControleur")
    private Integer idControleur;

    @Column(name = "idOpsControleur")
    private Long idOpsControleur;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
