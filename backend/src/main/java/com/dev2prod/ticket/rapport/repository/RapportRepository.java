package com.dev2prod.ticket.rapport.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.rapport.entity.RapportEntity;

@Repository
public interface RapportRepository extends JpaRepository<RapportEntity, Integer> {
    // Vous pouvez ajouter des méthodes de requête spécifiques ici
}
