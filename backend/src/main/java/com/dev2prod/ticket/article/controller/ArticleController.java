package com.dev2prod.ticket.article.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.article.entity.ArticleEntity;
import com.dev2prod.ticket.article.service.ArticleService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService service;

    @GetMapping
    public List<ArticleEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ArticleEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public ArticleEntity create(@RequestBody ArticleEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ArticleEntity update(@PathVariable Integer id, @RequestBody ArticleEntity entity) {
        ArticleEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdArticle(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
