package com.dev2prod.ticket.profile.entity;

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
@Table(name = "P_Profil")
public class ProfilEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProfil")
    private Integer idProfil;

    @Column(name = "Profil")
    private String profil;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
