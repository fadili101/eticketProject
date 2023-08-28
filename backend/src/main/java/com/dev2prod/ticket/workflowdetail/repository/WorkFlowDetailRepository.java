package com.dev2prod.ticket.workflowdetail.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dev2prod.ticket.workflowdetail.entity.WorkFlowDetailEntity;

@Repository
public interface WorkFlowDetailRepository extends JpaRepository<WorkFlowDetailEntity, Integer> {
    // Des méthodes de requête spécifiques peuvent être ajoutées ici
}

