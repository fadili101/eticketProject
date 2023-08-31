package com.dev2prod.ticket.typedepartement.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.typedepartement.entity.TypeDepartementEntity;
import com.dev2prod.ticket.typedepartement.repository.TypeDepartementRepository;

import java.util.List;

@Service
public class TypeDepartementService {

    @Autowired
    private TypeDepartementRepository repository;

    public List<TypeDepartementEntity> getAll() {
        return repository.findAll();
    }

    public TypeDepartementEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public TypeDepartementEntity save(TypeDepartementEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    // Ajoutez d'autres méthodes si nécessaire
}
