package com.dev2prod.ticket.ecran.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.ecran.entity.EcranEntity;

@Repository
public interface EcranRepository extends JpaRepository<EcranEntity, Integer> {
}