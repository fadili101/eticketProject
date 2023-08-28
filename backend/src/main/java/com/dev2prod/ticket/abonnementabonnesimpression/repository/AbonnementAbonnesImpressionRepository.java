package com.dev2prod.ticket.abonnementabonnesimpression.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.abonnementabonnesimpression.entity.AbonnementAbonnesImpressionEntity;

@Repository
public interface AbonnementAbonnesImpressionRepository extends JpaRepository<AbonnementAbonnesImpressionEntity, Long> {
    // Vous pouvez ajouter ici des méthodes de requête spécifiques
}
