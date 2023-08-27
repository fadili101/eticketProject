package com.dev2prod.ticket.art.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dev2prod.ticket.art.entity.ArtEntity;

import java.util.List;

public interface ArtRepository extends JpaRepository<ArtEntity, Integer> {
    List<ArtEntity> findByCpt(String cpt);
}
