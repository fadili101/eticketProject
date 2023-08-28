package com.dev2prod.ticket.workflowe.entity;

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
@Table(name = "P_Work_Flow")
public class WorkFlowEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idWorkFlow")
    private Integer idWorkFlow;

    @Column(name = "WorkFlow")
    private String workFlow;

    @Column(name = "TypeWorkFlow")
    private Integer typeWorkFlow;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
