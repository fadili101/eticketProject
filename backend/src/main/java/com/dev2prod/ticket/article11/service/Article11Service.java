package com.dev2prod.ticket.article11.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.article11.entity.Article11Entity;
import com.dev2prod.ticket.article11.repository.Article11Repository;

import java.util.List;


@Service
public class Article11Service {

    @Autowired
    private Article11Repository repository;

    public List<Article11Entity> getAll() {
        return repository.findAll();
    }

    public Article11Entity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Article11Entity save(Article11Entity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
