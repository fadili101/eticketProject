package com.dev2prod.ticket.typedepartement.entity;

import java.util.List;

import com.dev2prod.ticket.departement.entity.DepartementEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "T_Departement")
public class TypeDepartementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "typeDepartement_id")
    private Integer typeDepartement_id;

    @Column(name = "libelle")
    private String libelle;

    // Relation inverse avec DepartementEntity
    @OneToMany(mappedBy = "typeDepartement")
    private List<DepartementEntity> departements;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
