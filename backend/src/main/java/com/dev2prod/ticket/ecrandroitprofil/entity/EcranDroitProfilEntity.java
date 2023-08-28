package com.dev2prod.ticket.ecrandroitprofil.entity;

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
@Table(name = "P_Ecran_Droit_Profil")
public class EcranDroitProfilEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEcranDroit")
    private Integer idEcranDroit;

    @Column(name = "idEcran")
    private Integer idEcran;

    @Column(name = "idProfil")
    private Integer idProfil;

    @Column(name = "Ajout")
    private Integer ajout;

    @Column(name = "Modifier")
    private Integer modifier;

    @Column(name = "Supprimer")
    private Integer supprimer;

    @Column(name = "Consulter")
    private Integer consulter;

    @Column(name = "GrilleCalcul")
    private Integer grilleCalcul;

    @Column(name = "ChiffreAffaires")
    private Integer chiffreAffaires;

    @Column(name = "PrixVente")
    private Integer prixVente;

    @Column(name = "Visible")
    private Integer visible;

    @Column(name = "Composition")
    private Integer composition;

    @Column(name = "Avoir")
    private Integer avoir;

    @Column(name = "Retrait")
    private Integer retrait;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
