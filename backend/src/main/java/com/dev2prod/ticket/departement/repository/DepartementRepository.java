package com.dev2prod.ticket.departement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.departement.entity.DepartementEntity;

@Repository
public interface DepartementRepository extends JpaRepository<DepartementEntity, Integer> {
    List<DepartementEntity> findByDepartement(String departement);
}
