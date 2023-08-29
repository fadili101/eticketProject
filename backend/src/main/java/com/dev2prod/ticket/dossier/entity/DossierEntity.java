package com.dev2prod.ticket.dossier.entity;

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
@Table(name = "P_Dossier")
public class DossierEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDossier")
    private Integer idDossier;

    @Column(name = "Dossier", length = 50)
    private String dossier;

    @Column(name = "DossierSage", length = 50)
    private String dossierSage;

    @Column(name = "CheminDossier", length = 500)
    private String cheminDossier;

    @Column(name = "ServeurSage", length = 500)
    private String serveurSage;

    @Column(name = "InstanceSage", length = 500)
    private String instanceSage;

    @Column(name = "TypeBaseSage")
    private Integer typeBaseSage;

    @Column(name = "UserSage", length = 50)
    private String userSage;

    @Column(name = "PWSage", length = 500)
    private String pwSage;

    @Column(name = "TypeEchange")
    private Integer typeEchange;

    @Column(name = "DepotSage")
    private Integer depotSage;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
