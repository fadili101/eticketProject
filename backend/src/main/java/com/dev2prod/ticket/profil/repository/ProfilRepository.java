package com.dev2prod.ticket.profil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dev2prod.ticket.profil.entity.ProfilEntity;

public interface ProfilRepository extends JpaRepository<ProfilEntity, Long> {
}
