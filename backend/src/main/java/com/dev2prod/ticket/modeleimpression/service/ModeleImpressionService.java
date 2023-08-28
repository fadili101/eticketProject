package com.dev2prod.ticket.modeleimpression.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.modeleimpression.entity.ModeleImpressionEntity;
import com.dev2prod.ticket.modeleimpression.repository.ModeleImpressionRepository;

import java.util.List;

@Service
public class ModeleImpressionService {

    @Autowired
    private ModeleImpressionRepository repository;

    public List<ModeleImpressionEntity> getAll() {
        return repository.findAll();
    }

    public ModeleImpressionEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public ModeleImpressionEntity save(ModeleImpressionEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
