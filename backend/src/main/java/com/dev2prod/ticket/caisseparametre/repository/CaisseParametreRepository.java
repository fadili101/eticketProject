package com.dev2prod.ticket.caisseparametre.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dev2prod.ticket.caisseparametre.entity.CaisseParametreEntity;

public interface CaisseParametreRepository extends JpaRepository<CaisseParametreEntity, Integer> {
}
