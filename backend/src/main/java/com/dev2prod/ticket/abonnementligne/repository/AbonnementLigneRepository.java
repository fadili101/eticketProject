package com.dev2prod.ticket.abonnementligne.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.abonnementligne.entity.AbonnementLigneEntity;


@Repository
public interface AbonnementLigneRepository extends JpaRepository<AbonnementLigneEntity, Long> {
    // Vous pouvez ajouter ici des méthodes de requête spécifiques
}

