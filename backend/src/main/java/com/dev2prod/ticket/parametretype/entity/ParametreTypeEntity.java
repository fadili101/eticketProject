package com.dev2prod.ticket.parametretype.entity;

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
@Table(name = "P_Parametre_Type")
public class ParametreTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idParametreType")
    private Integer idParametreType;

    @Column(name = "ParametreType")
    private String parametreType;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
