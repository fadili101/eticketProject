package com.dev2prod.ticket.articletarifspecialheure.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.articletarifspecialheure.entity.ArticleTarifSpecialHeureEntity;

@Repository
public interface ArticleTarifSpecialHeureRepository extends JpaRepository<ArticleTarifSpecialHeureEntity, Long> {
    // Des méthodes de requête personnalisées peuvent être ajoutées ici si nécessaire
}