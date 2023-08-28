package com.dev2prod.ticket.statutworkFfow.entity;

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
@Table(name = "P_Statut_WorkFlow")
public class StatutWorkFlowEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idStatutWorkFlow")
    private Integer idStatutWorkFlow;

    @Column(name = "Statut")
    private String statut;

    @Column(name = "TypeStatut")
    private Integer typeStatut;

    @Column(name = "Action")
    private Integer action;

    @Column(name = "Flag_Supprimer")
    private Integer flagSupprimer;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
