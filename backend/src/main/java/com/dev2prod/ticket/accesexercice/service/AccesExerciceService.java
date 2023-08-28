package com.dev2prod.ticket.accesexercice.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.accesexercice.entity.AccesExerciceEntity;
import com.dev2prod.ticket.accesexercice.repository.AccesExerciceRepository;

import java.util.List;

@Service
public class AccesExerciceService {
    @Autowired
    private AccesExerciceRepository repository;

    public List<AccesExerciceEntity> getAll() {
        return repository.findAll();
    }

    public AccesExerciceEntity getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<AccesExerciceEntity> getByAnnee(Integer annee) {
        return repository.findByAnnee(annee);
    }

    public AccesExerciceEntity save(AccesExerciceEntity entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
