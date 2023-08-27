package com.dev2prod.ticket.caisseparametre.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.caisseparametre.entity.CaisseParametreEntity;
import com.dev2prod.ticket.caisseparametre.repository.CaisseParametreRepository;

import java.util.List;

@Service
public class CaisseParametreService {
    @Autowired
    private CaisseParametreRepository repository;

    public List<CaisseParametreEntity> getAll() {
        return repository.findAll();
    }

    public CaisseParametreEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public CaisseParametreEntity save(CaisseParametreEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
