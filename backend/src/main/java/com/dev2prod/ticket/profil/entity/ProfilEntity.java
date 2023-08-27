package com.dev2prod.ticket.profil.entity;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import com.dev2prod.ticket.caisse.entity.CaisseEntity;
import com.dev2prod.ticket.user.entity.UserEntity;
import com.dev2prod.ticket.workflow.entity.WorkflowEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Getter
@Setter
@Table(name = "profils")
public class ProfilEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profilId;

    private String nomProfil;
    private String description;
    
    @JsonIgnore
    @OneToMany(mappedBy = "profil") // le nom du champ dans l'entité User
    private Set<UserEntity> users = new HashSet<>();
    
    @ManyToMany
    @JoinTable(name = "profil_workflow",
            joinColumns = @JoinColumn(name = "profil_id"),
            inverseJoinColumns = @JoinColumn(name = "workflow_id")
    )
    private Set<WorkflowEntity> assignedWorkflows = new HashSet<>();

}
