package com.dev2prod.ticket.modeleimpression.entity;

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
@Table(name = "P_Modele_Impression")
public class ModeleImpressionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idModeleImpression")
    private Integer idModeleImpression;

    @Column(name = "ModeleImpression")
    private String modeleImpression;

    @Column(name = "CheminModele")
    private String cheminModele;

    @Column(name = "TypeModele")
    private Integer typeModele;

    @Column(name = "Imprimante")
    private String imprimante;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
