package com.dev2prod.ticket.clavier.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.clavier.entity.ClavierEntity;
import com.dev2prod.ticket.clavier.repository.ClavierRepository;

import java.util.List;


@Service
public class ClavierService {
    @Autowired
    private ClavierRepository repository;

    public List<ClavierEntity> getAll() {
        return repository.findAll();
    }

    public ClavierEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public ClavierEntity getByLibelle(String libelle) {
        return repository.findByLibelle(libelle);
    }

    public ClavierEntity save(ClavierEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
