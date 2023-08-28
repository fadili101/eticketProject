package com.dev2prod.ticket.previsionannuelle.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.previsionannuelle.entity.PrevisionAnnuelleEntity;
import com.dev2prod.ticket.previsionannuelle.repository.PrevisionAnnuelleRepository;

import java.util.List;

@Service
public class PrevisionAnnuelleService {

    @Autowired
    private PrevisionAnnuelleRepository repository;

    public List<PrevisionAnnuelleEntity> getAll() {
        return repository.findAll();
    }

    public PrevisionAnnuelleEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public PrevisionAnnuelleEntity save(PrevisionAnnuelleEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
