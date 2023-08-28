package com.dev2prod.ticket.ecran.entity;

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
@Table(name = "P_Ecran")
public class EcranEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEcran")
    private Integer idEcran;

    @Column(name = "Ecran", length = 50)
    private String ecran;

    @Column(name = "NomInterne", length = 50)
    private String nomInterne;

    @Column(name = "TypeEcran")
    private Integer typeEcran;

    @Column(name = "idEcranParent")
    private Integer idEcranParent;

    @Column(name = "EcranAssocie", length = 50)
    private String ecranAssocie;

    @Column(name = "GrilleCalcul")
    private Integer grilleCalcul;

    @Column(name = "ChiffreAffaires")
    private Integer chiffreAffaires;

    @Column(name = "PrixVente")
    private Integer prixVente;

    @Column(name = "Composition")
    private Integer composition;

    @Column(name = "Ajout")
    private Integer ajout;

    @Column(name = "MAJ")
    private Integer maj;

    @Column(name = "Supprimer")
    private Integer supprimer;

    @Column(name = "Avoir")
    private Integer avoir;

    @Column(name = "Afficher")
    private Integer afficher;

    @Column(name = "Retrait")
    private Integer retrait;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
