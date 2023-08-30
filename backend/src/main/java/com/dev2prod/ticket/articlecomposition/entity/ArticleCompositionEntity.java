package com.dev2prod.ticket.articlecomposition.entity;

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
@Table(name = "T_Article_Composition")
public class ArticleCompositionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idArticleAcces")
    private Long idArticleAcces;

    @Column(name = "idArticleCompose")
    private Integer idArticleCompose;

    @Column(name = "idArticleComposition")
    private Integer idArticleComposition;

    @Column(name = "Flag_Delete")
    private Integer flagDelete;

    @Column(name = "QuantiteAcces")
    private Integer quantiteAcces;

    @Column(name = "TypeQuantite")
    private Integer typeQuantite;

    // Constructeurs, accesseurs et mutateurs (omis pour brièveté)
}
