package com.dev2prod.ticket.caisse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev2prod.ticket.caisse.entity.CaisseEntity;

import java.util.List;

public interface CaisseRepository extends JpaRepository<CaisseEntity, Long> {
    List<CaisseEntity> findAllByCaisseId(long caisseId);
}
