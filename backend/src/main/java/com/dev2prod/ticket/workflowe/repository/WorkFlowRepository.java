package com.dev2prod.ticket.workflowe.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.workflowe.entity.WorkFlowEntity;

@Repository
public interface WorkFlowRepository extends JpaRepository<WorkFlowEntity, Integer> {
    // Méthodes de requête spécifiques peuvent être ajoutées ici
}
