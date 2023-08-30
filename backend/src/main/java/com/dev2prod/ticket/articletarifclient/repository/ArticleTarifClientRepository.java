package com.dev2prod.ticket.articletarifclient.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.articletarifclient.entity.ArticleTarifClientEntity;

@Repository
public interface ArticleTarifClientRepository extends JpaRepository<ArticleTarifClientEntity, Integer> {
    // Vous pouvez ajouter ici des méthodes de requête spécifiques si nécessaire
}