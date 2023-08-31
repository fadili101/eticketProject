package com.dev2prod.ticket.typedepartement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.typedepartement.entity.TypeDepartementEntity;

@Repository
public interface TypeDepartementRepository extends JpaRepository<TypeDepartementEntity, Integer> {
    // Vous pouvez ajouter des méthodes de recherche supplémentaires si nécessaire
}