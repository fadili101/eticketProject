package com.dev2prod.ticket.histgesaur.entity;

import java.time.LocalDateTime;

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
@Table(name = "HIST_GESAUR0")
public class HistGesaurEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NLIGNE")
    private Long nLigne;

    @Column(name = "DATEE")
    private LocalDateTime datee;

    @Column(name = "CAISSIER", length = 255)
    private String caissier;

    @Column(name = "DESIGNATION", length = 255)
    private String designation;

    @Column(name = "NTICKET", length = 255)
    private String nTicket;

    @Column(name = "NOPS", length = 255)
    private String nOps;

    @Column(name = "MONTANTHT")
    private Float montantHT;

    @Column(name = "MONTANTTVA")
    private Float montantTVA;

    @Column(name = "MONTANTTTC")
    private Float montantTTC;

    @Column(name = "NOMCLIENT", length = 255)
    private String nomClient;

    @Column(name = "MODEPAIEMENT", length = 255)
    private String modePaiement;

    @Column(name = "NCHEQUE", length = 255)
    private String nCheque;

    @Column(name = "Quantite")
    private Float quantite;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}