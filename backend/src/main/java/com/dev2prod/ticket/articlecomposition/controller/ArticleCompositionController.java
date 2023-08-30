package com.dev2prod.ticket.articlecomposition.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dev2prod.ticket.articlecomposition.entity.ArticleCompositionEntity;
import com.dev2prod.ticket.articlecomposition.service.ArticleCompositionService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/article-compositions")
public class ArticleCompositionController {

    @Autowired
    private ArticleCompositionService service;

    @GetMapping
    public List<ArticleCompositionEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ArticleCompositionEntity getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public ArticleCompositionEntity create(@RequestBody ArticleCompositionEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ArticleCompositionEntity update(@PathVariable Long id, @RequestBody ArticleCompositionEntity entity) {
        ArticleCompositionEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdArticleAcces(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
