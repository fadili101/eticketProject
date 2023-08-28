package com.dev2prod.ticket.dossierdepot.entity;

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
@Table(name = "P_Dossier_Depot")
public class DossierDepotEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDossierDepot")
    private Integer idDossierDepot;

    @Column(name = "idDossier")
    private Integer idDossier;

    @Column(name = "idDepotSage")
    private Integer idDepotSage;

    @Column(name = "idDepot")
    private Integer idDepot;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
