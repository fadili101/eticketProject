package com.dev2prod.ticket.modereglement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.modereglement.entity.ModeReglementEntity;


@Repository
public interface ModeReglementRepository extends JpaRepository<ModeReglementEntity, Integer> {
}