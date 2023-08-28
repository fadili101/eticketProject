package com.dev2prod.ticket.caisseparametre.entity;

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
@Table(name = "P_Caisse_Parametre")
public class CaisseParametreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCaisse")
    private Integer idCaisse;

    @Column(name = "NomMachine", length = 500)
    private String nomMachine;

    @Column(name = "ImprimanteTicket", length = 500)
    private String imprimanteTicket;

    @Column(name = "ImprimanteBillet", length = 500)
    private String imprimanteBillet;

    @Column(name = "ImprimanteFacture", length = 500)
    private String imprimanteFacture;

    @Column(name = "ImprimanteDevis", length = 500)
    private String imprimanteDevis;

    @Column(name = "ImprimanteDefaut", length = 500)
    private String imprimanteDefaut;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}