package com.dev2prod.ticket.controleur.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dev2prod.ticket.controleur.entity.ControleurEntity;

import java.util.List;

public interface ControleurRepository extends JpaRepository<ControleurEntity, Integer> {
    List<ControleurEntity> findByMarque(String marque);
}
