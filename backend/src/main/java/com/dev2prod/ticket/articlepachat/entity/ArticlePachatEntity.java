package com.dev2prod.ticket.articlepachat.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "T_ArticlePachat")
public class ArticlePachatEntity {

    @Id
    @Column(name = "idArticle")
    private Integer idArticle;

    @Column(name = "PrixUnitaireHT")
    private Float prixUnitaireHT;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
