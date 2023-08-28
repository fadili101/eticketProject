package com.dev2prod.ticket.ecrandroitprofil.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.ticket.ecrandroitprofil.entity.EcranDroitProfilEntity;


@Repository
public interface EcranDroitProfilRepository extends JpaRepository<EcranDroitProfilEntity, Integer> {
}