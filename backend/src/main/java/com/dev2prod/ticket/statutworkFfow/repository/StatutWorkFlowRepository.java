package com.dev2prod.ticket.statutworkFfow.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dev2prod.ticket.statutworkFfow.entity.StatutWorkFlowEntity;

@Repository
public interface StatutWorkFlowRepository extends JpaRepository<StatutWorkFlowEntity, Integer> {
    // Vous pouvez ajouter des méthodes de requête spécifiques ici
}
