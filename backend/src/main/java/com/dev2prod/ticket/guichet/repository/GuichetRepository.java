package com.dev2prod.ticket.guichet.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.guichet.entity.GuichetEntity;


@Repository
public interface GuichetRepository extends JpaRepository<GuichetEntity, Integer> {
}