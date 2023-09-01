package com.dev2prod.ticket.user.entity;

import lombok.Data;


import com.dev2prod.ticket.caisse.entity.CaisseEntity;
import com.dev2prod.ticket.departement.entity.DepartementEntity;
import com.dev2prod.ticket.profil.entity.ProfilEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "users")
public class UserEntity {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long userId;
	    private String prenomUser;
	    private Boolean actif;
	    private String login;
	    private String motPasse;
		private String cO_NO;
	    private String nomUser;
	    private Boolean toutDocument;
	    private Boolean updatePassword;
	    @ManyToMany
	    @JoinTable(name = "user_caisse",
	            joinColumns = @JoinColumn(name = "user_id"),
	            inverseJoinColumns = @JoinColumn(name = "caisse_id")
	    )
	    private Set<CaisseEntity> assignedCaisses = new HashSet<>();
	    //@JsonIgnore
	    @ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "profil_id") // le nom de la colonne dans la table User
	    private ProfilEntity profil;

	    /*@ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "departement_id")
	    private DepartementEntity departement;*/
	    @JsonIgnore
	    @OneToMany(mappedBy = "responsable")
	    private List<DepartementEntity> departementsResponsables;

	
	    

}
