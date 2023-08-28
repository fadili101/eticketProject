package com.dev2prod.ticket.profile.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.profile.entity.ProfilEntity;


@Repository
public interface ProfilRepository extends JpaRepository<ProfilEntity, Integer> {
    // Vous pouvez ajouter des méthodes de requête spécifiques ici
}