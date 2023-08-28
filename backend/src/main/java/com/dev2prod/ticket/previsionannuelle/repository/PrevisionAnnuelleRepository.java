package com.dev2prod.ticket.previsionannuelle.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.previsionannuelle.entity.PrevisionAnnuelleEntity;


@Repository
public interface PrevisionAnnuelleRepository extends JpaRepository<PrevisionAnnuelleEntity, Integer> {
    // Méthodes spécifiques de requête pourraient être ajoutées ici
}