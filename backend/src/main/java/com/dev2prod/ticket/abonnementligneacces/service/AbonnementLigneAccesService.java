package com.dev2prod.ticket.abonnementligneacces.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.abonnementligneacces.entity.AbonnementLigneAccesEntity;
import com.dev2prod.ticket.abonnementligneacces.repository.AbonnementLigneAccesRepository;


import java.util.List;


@Service
public class AbonnementLigneAccesService {

    @Autowired
    private AbonnementLigneAccesRepository repository;

    public List<AbonnementLigneAccesEntity> getAll() {
        return repository.findAll();
    }

    public AbonnementLigneAccesEntity getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public AbonnementLigneAccesEntity save(AbonnementLigneAccesEntity entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
