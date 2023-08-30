package com.dev2prod.ticket.abonnementligne.entity;

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
@Table(name = "T_Abonnement_Ligne")
public class AbonnementLigneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAbonnementLigne")
    private Long idAbonnementLigne;

    @Column(name = "idAbonnement")
    private Long idAbonnement;

    @Column(name = "idArticle")
    private Integer idArticle;

    @Column(name = "Accesillimite")
    private Integer accesillimite;

    @Column(name = "NombreAcces")
    private Integer nombreAcces;

    @Column(name = "PointageAcces")
    private Integer pointageAcces;

    @Column(name = "GUIDAbonnement")
    private String guidAbonnement;

    @Column(name = "NumAbonnement")
    private String numAbonnement;

    @Column(name = "TypeAbonne")
    private Integer typeAbonne;

    @Column(name = "NomAbonne")
    private String nomAbonne;

    @Column(name = "PrenomAbonne")
    private String prenomAbonne;

    @Column(name = "CINAbonne")
    private String cinAbonne;

    @Column(name = "DateNaissanceAbonne")
    private Date dateNaissanceAbonne;

    @Column(name = "TelAbonne")
    private String telAbonne;

    @Column(name = "EmailAbonne")
    private String emailAbonne;

    @Column(name = "AdresseAbonne")
    private String adresseAbonne;

    @Column(name = "Tuteur")
    private String tuteur;

    @Column(name = "NomTuteur")
    private String nomTuteur;

    @Column(name = "PrenomTuteur")
    private String prenomTuteur;

    @Column(name = "CINTuteur")
    private String cinTuteur;

    @Column(name = "TelTuteur")
    private String telTuteur;

    @Column(name = "EmailTuteur")
    private String emailTuteur;

    @Column(name = "GUIDAbonnementLigne")
    private String guidAbonnementLigne;

    @Column(name = "CodeBarre")
    private String codeBarre;

    @Column(name = "CodeBarreAcces")
    private String codeBarreAcces;

    @Column(name = "Renseigner")
    private Integer renseigner;

    @Column(name = "Photo")
    private String photo;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
