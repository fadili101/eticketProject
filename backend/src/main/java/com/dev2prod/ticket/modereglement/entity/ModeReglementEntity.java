package com.dev2prod.ticket.modereglement.entity;

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
@Table(name = "P_ModeReglement")
public class ModeReglementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idModeReglement")
    private Integer idModeReglement;

    @Column(name = "ModeReglement")
    private String modeReglement;

    @Column(name = "PieceObligatoire")
    private Integer pieceObligatoire;

    @Column(name = "idTypeReglement")
    private Integer idTypeReglement;

    @Column(name = "idJournal")
    private Integer idJournal;

    @Column(name = "CompteComptable")
    private String compteComptable;

    @Column(name = "TauxCommission")
    private Float tauxCommission;

    @Column(name = "TauxTva")
    private Float tauxTva;

    @Column(name = "CompteHT")
    private String compteHT;

    @Column(name = "CompteTVA")
    private String compteTVA;

    @Column(name = "Flag_Delete")
    private Integer flagDelete;

    @Column(name = "AvecCommission")
    private Integer avecCommission;

    @Column(name = "ADeduireEncaissement")
    private Integer aDeduireEncaissement;

    @Column(name = "LibelleCompteHT")
    private String libelleCompteHT;

    @Column(name = "LibelleCompteTVA")
    private String libelleCompteTVA;
}
