package com.dev2prod.ticket.abonnement.entity;

import java.util.Date;

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
@Table(name = "T_Abonnement")
public class AbonnementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAbonnement")
    private Long idAbonnement;

    @Column(name = "idArticle")
    private Integer idArticle;

    @Column(name = "NumAbonnement")
    private String numAbonnement;

    @Column(name = "DateAbonnement")
    private Date dateAbonnement;

    @Column(name = "IntituleAbonnement")
    private String intituleAbonnement;

    @Column(name = "ValiditeAbonnement")
    private Integer validiteAbonnement;

    @Column(name = "Accesillimite")
    private Integer accesillimite;

    @Column(name = "NombreAcces")
    private Integer nombreAcces;

    @Column(name = "DateDebuteValidtite")
    private Date dateDebutValidite;

    @Column(name = "DateFinValidtite")
    private Date dateFinValidite;

    @Column(name = "Renouveler")
    private Integer renouveler;

    @Column(name = "DateRenouvellement")
    private Date dateRenouvellement;

    @Column(name = "PrixAbonnement")
    private Float prixAbonnement;

    @Column(name = "idModeReglement")
    private Integer idModeReglement;

    @Column(name = "NumCheque_Transaction")
    private String numChequeTransaction;

    @Column(name = "GUIDAbonnement")
    private String guidAbonnement;

    @Column(name = "GUIDid")
    private String guidId;

    @Column(name = "Statut")
    private Integer statut;

    @Column(name = "idArticleAbonnement")
    private Long idArticleAbonnement;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
