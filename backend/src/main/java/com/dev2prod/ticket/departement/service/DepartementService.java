package com.dev2prod.ticket.departement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.departement.entity.DepartementEntity;
import com.dev2prod.ticket.departement.repository.DepartementRepository;


@Service
public class DepartementService {
    @Autowired
    private DepartementRepository repository;

    public List<DepartementEntity> getAll() {
        return repository.findAll();
    }

    public DepartementEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<DepartementEntity> getByDepartement(String departement) {
        return repository.findByDepartement(departement);
    }

    public DepartementEntity save(DepartementEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
