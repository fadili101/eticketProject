package com.dev2prod.ticket.departement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "P_Departement")
public class DepartementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departement_id")
    private Integer departement_id;

    @Column(name = "Departement", length = 50)
    private String departement;

    @Column(name = "idDepratementParent")
    private Integer idDepartementParent;

    @Column(name = "FlagTraitement")
    private Integer flagTraitement;

    @Column(name = "TypeDepartement")
    private Integer typeDepartement;

    @Column(name = "Responsable")
    private Integer responsable;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
