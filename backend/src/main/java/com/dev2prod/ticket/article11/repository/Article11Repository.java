package com.dev2prod.ticket.article11.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.article11.entity.Article11Entity;

@Repository
public interface Article11Repository extends JpaRepository<Article11Entity, Integer> {
    // Vous pouvez ajouter des méthodes de requête personnalisées si nécessaire
}