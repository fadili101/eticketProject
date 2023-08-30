package com.dev2prod.ticket.abonnementligneacces.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.abonnementligneacces.entity.AbonnementLigneAccesEntity;


@Repository
public interface AbonnementLigneAccesRepository extends JpaRepository<AbonnementLigneAccesEntity, Long> {
    // Vous pouvez ajouter ici des méthodes de requête spécifiques
}