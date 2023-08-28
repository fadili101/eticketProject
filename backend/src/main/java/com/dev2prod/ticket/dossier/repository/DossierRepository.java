package com.dev2prod.ticket.dossier.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.dossier.entity.DossierEntity;

import java.util.List;

@Repository
public interface DossierRepository extends JpaRepository<DossierEntity, Integer> {
    List<DossierEntity> findByDossier(String dossier);
}
