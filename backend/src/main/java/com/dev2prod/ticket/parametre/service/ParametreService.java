package com.dev2prod.ticket.parametre.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.parametre.entity.ParametreEntity;
import com.dev2prod.ticket.parametre.repository.ParametreRepository;

import java.util.List;

@Service
public class ParametreService {

    @Autowired
    private ParametreRepository repository;

    public List<ParametreEntity> getAll() {
        return repository.findAll();
    }

    public ParametreEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public ParametreEntity save(ParametreEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
