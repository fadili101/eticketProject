package com.dev2prod.ticket.tourniquet.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dev2prod.ticket.tourniquet.entity.TourniquetEntity;


@Repository
public interface TourniquetRepository extends JpaRepository<TourniquetEntity, Integer> {
    // Vous pouvez ajouter des méthodes de requête spécifiques ici si nécessaire
}
