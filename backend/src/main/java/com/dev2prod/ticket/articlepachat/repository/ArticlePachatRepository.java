package com.dev2prod.ticket.articlepachat.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.articlepachat.entity.ArticlePachatEntity;


@Repository
public interface ArticlePachatRepository extends JpaRepository<ArticlePachatEntity, Integer> {
    // Vous pouvez ajouter des méthodes de requête personnalisées si nécessaire
}