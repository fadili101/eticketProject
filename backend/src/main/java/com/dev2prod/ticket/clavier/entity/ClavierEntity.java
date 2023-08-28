package com.dev2prod.ticket.clavier.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "P_Clavier", schema = "dbo")
public class ClavierEntity {

    @Id
    @Column(name = "idNum")
    private Integer idNum;

    @Column(name = "Libelle", length = 50)
    private String libelle;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
