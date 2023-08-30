package com.dev2prod.ticket.articletarifspecial.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.articletarifspecial.entity.ArticleTarifSpecialEntity;

@Repository
public interface ArticleTarifSpecialRepository extends JpaRepository<ArticleTarifSpecialEntity, Long> {
    // Vous pouvez ajouter des méthodes de requête personnalisées ici si nécessaire
}