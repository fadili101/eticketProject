package com.dev2prod.ticket.dossierdepot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.dossierdepot.entity.DossierDepotEntity;

import java.util.List;

@Repository
public interface DossierDepotRepository extends JpaRepository<DossierDepotEntity, Integer> {
    List<DossierDepotEntity> findByIdDossier(Integer idDossier);
}