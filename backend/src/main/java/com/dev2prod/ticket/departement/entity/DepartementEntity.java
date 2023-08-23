package com.dev2prod.ticket.departement.entity;

import java.util.HashSet;
import java.util.Set;

import com.dev2prod.ticket.user.entity.UserEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "departements")
public class DepartementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departementId;

    @Column(name = "nom")
    private String nom;

    @Column(name = "type")
    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private DepartementEntity parent;

    @JsonIgnore
    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    private Set<DepartementEntity> children = new HashSet<>();
    
    // Supposons que chaque département a plusieurs utilisateurs
    @JsonIgnore
    @OneToMany(mappedBy = "departement", fetch = FetchType.LAZY)
    private Set<UserEntity> userSet = new HashSet<>();
}
