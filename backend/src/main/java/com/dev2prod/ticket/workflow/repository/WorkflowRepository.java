package com.dev2prod.ticket.workflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.workflow.entity.WorkflowEntity;

@Repository
public interface WorkflowRepository extends JpaRepository<WorkflowEntity, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire.
}
