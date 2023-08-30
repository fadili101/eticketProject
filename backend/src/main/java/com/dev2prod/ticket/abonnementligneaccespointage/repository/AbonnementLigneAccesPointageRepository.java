package com.dev2prod.ticket.abonnementligneaccespointage.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.abonnementligneaccespointage.entity.AbonnementLigneAccesPointageEntity;


@Repository
public interface AbonnementLigneAccesPointageRepository extends JpaRepository<AbonnementLigneAccesPointageEntity, Long> {
    // Vous pouvez ajouter ici des méthodes de requête spécifiques
}