package com.dev2prod.ticket.abonnementligne.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.abonnementligne.entity.AbonnementLigneEntity;
import com.dev2prod.ticket.abonnementligne.repository.AbonnementLigneRepository;


import java.util.List;



@Service
public class AbonnementLigneService {

    @Autowired
    private AbonnementLigneRepository repository;

    public List<AbonnementLigneEntity> getAll() {
        return repository.findAll();
    }

    public AbonnementLigneEntity getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public AbonnementLigneEntity save(AbonnementLigneEntity entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
