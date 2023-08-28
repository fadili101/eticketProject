package com.dev2prod.ticket.accessalarie.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.accessalarie.entity.AccesSalarieEntity;
import com.dev2prod.ticket.accessalarie.repository.AccesSalarieRepository;

import java.util.List;

@Service
public class AccesSalarieService {
    @Autowired
    private AccesSalarieRepository repository;

    public List<AccesSalarieEntity> getAll() {
        return repository.findAll();
    }

    public AccesSalarieEntity getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<AccesSalarieEntity> findByIdAccesExercice(Long idAccesExercice) {
        return repository.findByIdAccesExercice(idAccesExercice);
    }

    public AccesSalarieEntity save(AccesSalarieEntity entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
