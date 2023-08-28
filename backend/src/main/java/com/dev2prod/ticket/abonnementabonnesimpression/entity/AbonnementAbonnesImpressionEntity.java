package com.dev2prod.ticket.abonnementabonnesimpression.entity;

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
@Table(name = "T_Abonnement_Abonnes_Impression")
public class AbonnementAbonnesImpressionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAbonnementImpression")
    private Long idAbonnementImpression;

    @Column(name = "idAbonnementLigne")
    private Long idAbonnementLigne;

    @Column(name = "idAbonnement")
    private Long idAbonnement;

    @Column(name = "Accesillimite")
    private Integer accesillimite;

    @Column(name = "NombreAcces")
    private Integer nombreAcces;

    @Column(name = "PointageAcces")
    private Integer pointageAcces;

    @Column(name = "NumAbonnement")
    private String numAbonnement;

    @Column(name = "TypeAbonne")
    private Integer typeAbonne;

    @Column(name = "Abonne")
    private String abonne;

    @Column(name = "CIN")
    private String cin;

    @Column(name = "Tuteur")
    private String tuteur;

    @Column(name = "CINTuteur")
    private String cinTuteur;

    @Column(name = "CodeBarreAcces")
    private String codeBarreAcces;

    @Column(name = "ImageAbonne")
    private String imageAbonne;

    @Column(name = "AccesAutorise")
    private String accesAutorise;

    @Column(name = "DateFinValidite")
    private Date dateFinValidite;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
