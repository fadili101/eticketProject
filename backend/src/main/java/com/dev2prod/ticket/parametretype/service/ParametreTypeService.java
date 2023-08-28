package com.dev2prod.ticket.parametretype.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.parametretype.entity.ParametreTypeEntity;
import com.dev2prod.ticket.parametretype.repository.ParametreTypeRepository;

import java.util.List;

@Service
public class ParametreTypeService {

    @Autowired
    private ParametreTypeRepository repository;

    public List<ParametreTypeEntity> getAll() {
        return repository.findAll();
    }

    public ParametreTypeEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public ParametreTypeEntity save(ParametreTypeEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
