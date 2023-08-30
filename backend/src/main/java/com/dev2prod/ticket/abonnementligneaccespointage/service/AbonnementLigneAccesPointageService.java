package com.dev2prod.ticket.abonnementligneaccespointage.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.abonnementligneaccespointage.entity.AbonnementLigneAccesPointageEntity;
import com.dev2prod.ticket.abonnementligneaccespointage.repository.AbonnementLigneAccesPointageRepository;

import java.util.List;


@Service
public class AbonnementLigneAccesPointageService {

    @Autowired
    private AbonnementLigneAccesPointageRepository repository;

    public List<AbonnementLigneAccesPointageEntity> getAll() {
        return repository.findAll();
    }

    public AbonnementLigneAccesPointageEntity getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public AbonnementLigneAccesPointageEntity save(AbonnementLigneAccesPointageEntity entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
