package com.dev2prod.ticket.champcomptable.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dev2prod.ticket.champcomptable.entity.ChampComptableEntity;

import java.util.List;

public interface ChampComptableRepository extends JpaRepository<ChampComptableEntity, Integer> {
    List<ChampComptableEntity> findByNomChamp(String nomChamp);
}
