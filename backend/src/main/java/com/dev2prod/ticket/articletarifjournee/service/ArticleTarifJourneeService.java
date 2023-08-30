package com.dev2prod.ticket.articletarifjournee.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.articletarifjournee.entity.ArticleTarifJourneeEntity;
import com.dev2prod.ticket.articletarifjournee.repository.ArticleTarifJourneeRepository;

import java.util.List;

@Service
public class ArticleTarifJourneeService {

    @Autowired
    private ArticleTarifJourneeRepository repository;

    public List<ArticleTarifJourneeEntity> getAll() {
        return repository.findAll();
    }

    public ArticleTarifJourneeEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public ArticleTarifJourneeEntity save(ArticleTarifJourneeEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
