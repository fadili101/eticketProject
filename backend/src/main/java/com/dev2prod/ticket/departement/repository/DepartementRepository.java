package com.dev2prod.ticket.departement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.departement.entity.DepartementEntity;

@Repository
public interface DepartementRepository extends JpaRepository<DepartementEntity, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire.
}
