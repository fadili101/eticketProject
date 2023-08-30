package com.dev2prod.ticket.article.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.article.entity.ArticleEntity;
import com.dev2prod.ticket.article.repository.ArticleRepository;


import java.util.List;


@Service
public class ArticleService {

    @Autowired
    private ArticleRepository repository;

    public List<ArticleEntity> getAll() {
        return repository.findAll();
    }

    public ArticleEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public ArticleEntity save(ArticleEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
