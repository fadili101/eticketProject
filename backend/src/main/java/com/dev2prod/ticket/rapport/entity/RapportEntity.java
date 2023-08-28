package com.dev2prod.ticket.rapport.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "P_Rapport")
public class RapportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRapport")
    private Integer idRapport;

    @Column(name = "Rapport")
    private String rapport;

    @Lob
    @Column(name = "Entete", columnDefinition = "TEXTIMAGE_ON [PRIMARY]")
    private String entete;

    @Column(name = "Flaf_Traitement")
    private Integer flagTraitement;

    @Column(name = "idEcran")
    private Integer idEcran;

    @Column(name = "Caisse")
    private Integer caisse;

    @Column(name = "Caisseir")
    private Integer caissier;

    // Les autres colonnes (omises pour brièveté)

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
