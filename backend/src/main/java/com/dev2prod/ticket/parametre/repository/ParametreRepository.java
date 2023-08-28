package com.dev2prod.ticket.parametre.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.parametre.entity.ParametreEntity;


@Repository
public interface ParametreRepository extends JpaRepository<ParametreEntity, Integer> {
}