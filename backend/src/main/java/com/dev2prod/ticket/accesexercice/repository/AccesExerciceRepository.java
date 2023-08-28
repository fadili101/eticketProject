package com.dev2prod.ticket.accesexercice.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev2prod.ticket.accesexercice.entity.AccesExerciceEntity;

public interface AccesExerciceRepository extends JpaRepository<AccesExerciceEntity, Long> {
    List<AccesExerciceEntity> findByAnnee(Integer annee);
}
