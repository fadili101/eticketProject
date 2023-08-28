package com.dev2prod.ticket.histgesaur.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dev2prod.ticket.histgesaur.entity.HistGesaurEntity;

import java.util.List;

public interface HistGesaurRepository extends JpaRepository<HistGesaurEntity, Long> {
    List<HistGesaurEntity> findByCaissier(String caissier);
}
