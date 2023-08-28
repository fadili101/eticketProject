package com.dev2prod.ticket.clavier.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dev2prod.ticket.clavier.entity.ClavierEntity;


public interface ClavierRepository extends JpaRepository<ClavierEntity, Integer> {
    ClavierEntity findByLibelle(String libelle);
}
