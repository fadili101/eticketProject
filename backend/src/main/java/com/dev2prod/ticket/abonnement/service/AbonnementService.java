package com.dev2prod.ticket.abonnement.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.abonnement.entity.AbonnementEntity;
import com.dev2prod.ticket.abonnement.repository.AbonnementRepository;

import java.util.List;


@Service
public class AbonnementService {

    @Autowired
    private AbonnementRepository repository;

    public List<AbonnementEntity> getAll() {
        return repository.findAll();
    }

    public AbonnementEntity getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public AbonnementEntity save(AbonnementEntity entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
