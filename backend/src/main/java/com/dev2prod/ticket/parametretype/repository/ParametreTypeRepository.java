package com.dev2prod.ticket.parametretype.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.parametretype.entity.ParametreTypeEntity;


@Repository
public interface ParametreTypeRepository extends JpaRepository<ParametreTypeEntity, Integer> {
}