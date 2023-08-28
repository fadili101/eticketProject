package com.dev2prod.ticket.abonnementabonnesimpression.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.abonnementabonnesimpression.entity.AbonnementAbonnesImpressionEntity;
import com.dev2prod.ticket.abonnementabonnesimpression.repository.AbonnementAbonnesImpressionRepository;

import java.util.List;


@Service
public class AbonnementAbonnesImpressionService {

    @Autowired
    private AbonnementAbonnesImpressionRepository repository;

    public List<AbonnementAbonnesImpressionEntity> getAll() {
        return repository.findAll();
    }

    public AbonnementAbonnesImpressionEntity getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public AbonnementAbonnesImpressionEntity save(AbonnementAbonnesImpressionEntity entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
