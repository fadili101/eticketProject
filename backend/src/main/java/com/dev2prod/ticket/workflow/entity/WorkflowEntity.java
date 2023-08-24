package com.dev2prod.ticket.workflow.entity;

import java.util.HashSet;
import java.util.Set;

import com.dev2prod.ticket.profil.entity.ProfilEntity;
import com.dev2prod.ticket.user.entity.UserEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "workflow")
public class WorkflowEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long workFlowId;

    @Column(name = "nom")
    private String nom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workflow_id")
    private WorkflowEntity parent;

    @JsonIgnore
    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    private Set<WorkflowEntity> children = new HashSet<>();
    
    @JsonIgnore
    @ManyToMany(mappedBy = "assignedWorkflows")
    private Set<ProfilEntity> profilSet = new HashSet<>();

}
