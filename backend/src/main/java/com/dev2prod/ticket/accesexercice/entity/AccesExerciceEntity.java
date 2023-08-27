package com.dev2prod.ticket.accesexercice.entity;

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
@Table(name = "P_Acces_Exercice")
public class AccesExerciceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAcces_Exercice")
    private Long idAccesExercice;

    @Column(name = "Annee")
    private Integer annee;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}