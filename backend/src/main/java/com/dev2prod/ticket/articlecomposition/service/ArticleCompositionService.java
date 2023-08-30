package com.dev2prod.ticket.articlecomposition.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.articlecomposition.entity.ArticleCompositionEntity;
import com.dev2prod.ticket.articlecomposition.repository.ArticleCompositionRepository;

import java.util.List;

@Service
public class ArticleCompositionService {

    @Autowired
    private ArticleCompositionRepository repository;

    public List<ArticleCompositionEntity> getAll() {
        return repository.findAll();
    }

    public ArticleCompositionEntity getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public ArticleCompositionEntity save(ArticleCompositionEntity entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
