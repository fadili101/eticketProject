package com.dev2prod.ticket.guichet.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.guichet.entity.GuichetEntity;
import com.dev2prod.ticket.guichet.repository.GuichetRepository;

import java.util.List;


@Service
public class GuichetService {

    @Autowired
    private GuichetRepository repository;

    public List<GuichetEntity> getAll() {
        return repository.findAll();
    }

    public GuichetEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public GuichetEntity save(GuichetEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
