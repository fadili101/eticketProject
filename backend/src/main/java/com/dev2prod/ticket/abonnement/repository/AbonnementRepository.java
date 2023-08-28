package com.dev2prod.ticket.abonnement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.abonnement.entity.AbonnementEntity;

@Repository
public interface AbonnementRepository extends JpaRepository<AbonnementEntity, Long> {
    // Des méthodes de requête spécifiques peuvent être ajoutées ici
}
