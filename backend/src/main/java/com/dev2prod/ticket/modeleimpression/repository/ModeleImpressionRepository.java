package com.dev2prod.ticket.modeleimpression.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.modeleimpression.entity.ModeleImpressionEntity;


@Repository
public interface ModeleImpressionRepository extends JpaRepository<ModeleImpressionEntity, Integer> {
}