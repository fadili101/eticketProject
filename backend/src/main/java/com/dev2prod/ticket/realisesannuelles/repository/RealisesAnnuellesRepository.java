package com.dev2prod.ticket.realisesannuelles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dev2prod.ticket.realisesannuelles.entity.RealisesAnnuellesEntity;

@Repository
public interface RealisesAnnuellesRepository extends JpaRepository<RealisesAnnuellesEntity, Integer> {
    // Vous pouvez ajouter des méthodes de requête spécifiques ici
}
