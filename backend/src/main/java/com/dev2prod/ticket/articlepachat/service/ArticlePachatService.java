package com.dev2prod.ticket.articlepachat.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.articlepachat.entity.ArticlePachatEntity;
import com.dev2prod.ticket.articlepachat.repository.ArticlePachatRepository;

import java.util.List;

@Service
public class ArticlePachatService {

    @Autowired
    private ArticlePachatRepository repository;

    public List<ArticlePachatEntity> getAll() {
        return repository.findAll();
    }

    public ArticlePachatEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public ArticlePachatEntity save(ArticlePachatEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
