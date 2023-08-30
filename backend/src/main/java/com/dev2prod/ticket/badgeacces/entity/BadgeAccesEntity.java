package com.dev2prod.ticket.badgeacces.entity;

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
@Table(name = "T_Badge_Acces")
public class BadgeAccesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBadge_Acces")
    private Long idBadgeAcces;

    @Column(name = "idBadge")
    private Long idBadge;

    @Column(name = "HeureValidation")
    private String heureValidation;

    @Column(name = "DateValidation")
    private LocalDateTime dateValidation;

    @Column(name = "idTourniquet")
    private Integer idTourniquet;

    @Column(name = "idControleur")
    private Integer idControleur;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
