package com.dev2prod.ticket.tourniquet.entity;

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
@Table(name = "P_Tourniquet")
public class TourniquetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTourniquet")
    private Integer idTourniquet;

    @Column(name = "Tourniquet")
    private String tourniquet;

    @Column(name = "idZone")
    private Integer idZone;

    @Column(name = "idControleur")
    private Integer idControleur;

    @Column(name = "StatutTourniquet")
    private Integer statutTourniquet;

    @Column(name = "TypeAcces")
    private Integer typeAcces;

    @Column(name = "SensOpen")
    private Integer sensOpen;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
