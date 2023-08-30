package com.dev2prod.ticket.abonnementligneacces.entity;

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
@Table(name = "T_Abonnement_Ligne_Acces")
public class AbonnementLigneAccesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(name = "TypeAccesLibelle")
    private String typeAccesLibelle;

    @Column(name = "Designation")
    private String designation;

    @Column(name = "NombreAcces")
    private Integer nombreAcces;

    @Column(name = "Accesillimite")
    private Integer accesillimite;

    @Column(name = "PointageAcces")
    private Integer pointageAcces;

    @Column(name = "DateDebuteValidtite")
    private Date dateDebuteValidtite;

    @Column(name = "DateFinValidtite")
    private Date dateFinValidtite;

    @Column(name = "CodeBarreAcces")
    private String codeBarreAcces;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
