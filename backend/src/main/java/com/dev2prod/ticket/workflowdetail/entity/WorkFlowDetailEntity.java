package com.dev2prod.ticket.workflowdetail.entity;

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
@Table(name = "P_Work_Flow_Detail")
public class WorkFlowDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idWorkFlowStatut")
    private Integer idWorkFlowStatut;

    @Column(name = "idWorkFlow")
    private Integer idWorkFlow;

    @Column(name = "idStatutPrecedent")
    private Integer idStatutPrecedent;

    @Column(name = "idStatut")
    private Integer idStatut;

    @Column(name = "idStatutSuivant")
    private Integer idStatutSuivant;

    @Column(name = "Ordre")
    private Integer ordre;

    @Column(name = "idStatutSysteme")
    private Integer idStatutSysteme;

    @Column(name = "idProfil")
    private Integer idProfil;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
