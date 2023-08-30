package com.dev2prod.ticket.badgeacces.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.badgeacces.entity.BadgeAccesEntity;


@Repository
public interface BadgeAccesRepository extends JpaRepository<BadgeAccesEntity, Long> {
    // Vous pouvez ajouter des méthodes de requête personnalisées si nécessaire
}