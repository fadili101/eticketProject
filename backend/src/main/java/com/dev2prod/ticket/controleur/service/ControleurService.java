package com.dev2prod.ticket.controleur.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dev2prod.ticket.controleur.entity.ControleurEntity;
import com.dev2prod.ticket.controleur.repository.ControleurRepository;

import java.util.List;


@Service
public class ControleurService {
    @Autowired
    private ControleurRepository repository;

    public List<ControleurEntity> getAll() {
        return repository.findAll();
    }

    public ControleurEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<ControleurEntity> getByMarque(String marque) {
        return repository.findByMarque(marque);
    }

    public ControleurEntity save(ControleurEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
