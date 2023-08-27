package com.dev2prod.ticket.caisse.entity;

import com.dev2prod.ticket.user.entity.UserEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "caisses")
public class CaisseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long caisseId;
	private String nomCaisse;
	private String descriptionCaisse;
	
	@JsonIgnore
    @ManyToMany(mappedBy = "assignedCaisses")
    private Set<UserEntity> userSet = new HashSet<>();

}
