package com.dev2prod.ticket.accessalarie.entity;

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
@Table(name = "P_Acces_Salarie")
public class AccesSalarieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAccesSalarie")
    private Long idAccesSalarie;

    @Column(name = "idAcces_Exercice")
    private Long idAccesExercice;

    @Column(name = "idCategorieSalarie")
    private Integer idCategorieSalarie;

    @Column(name = "TypeAcces")
    private Integer typeAcces;

    @Column(name = "NombreAcces")
    private Float nombreAcces;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
