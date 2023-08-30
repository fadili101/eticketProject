package com.dev2prod.ticket.articlecomposition.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.articlecomposition.entity.ArticleCompositionEntity;

@Repository
public interface ArticleCompositionRepository extends JpaRepository<ArticleCompositionEntity, Long> {
    // Vous pouvez ajouter ici des méthodes de requête spécifiques si nécessaire
}