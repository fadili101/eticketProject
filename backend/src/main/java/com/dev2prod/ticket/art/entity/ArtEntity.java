package com.dev2prod.ticket.art.entity;

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
@Table(name = "aaart")
public class ArtEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idart")
    private Integer idart;

    @Column(name = "cpt", length = 50)
    private String cpt;

    @Column(name = "jtl", length = 50)
    private String jtl;

    @Column(name = "libel", length = 500)
    private String libel;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
