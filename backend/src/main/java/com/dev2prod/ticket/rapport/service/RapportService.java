package com.dev2prod.ticket.rapport.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.rapport.entity.RapportEntity;
import com.dev2prod.ticket.rapport.repository.RapportRepository;

import java.util.List;

@Service
public class RapportService {

    @Autowired
    private RapportRepository repository;

    public List<RapportEntity> getAll() {
        return repository.findAll();
    }

    public RapportEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public RapportEntity save(RapportEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
