package com.dev2prod.ticket.articletarifjournee.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.articletarifjournee.entity.ArticleTarifJourneeEntity;

@Repository
public interface ArticleTarifJourneeRepository extends JpaRepository<ArticleTarifJourneeEntity, Integer> {
    // Vous pouvez ajouter des méthodes de requête personnalisées ici si nécessaire
}