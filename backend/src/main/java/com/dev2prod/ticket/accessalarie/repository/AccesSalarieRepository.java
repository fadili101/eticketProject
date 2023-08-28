package com.dev2prod.ticket.accessalarie.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev2prod.ticket.accessalarie.entity.AccesSalarieEntity;

public interface AccesSalarieRepository extends JpaRepository<AccesSalarieEntity, Long> {
    List<AccesSalarieEntity> findByIdAccesExercice(Long idAccesExercice);
}
