package com.dev2prod.ticket.articlepachat.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.articlepachat.entity.ArticlePachatEntity;
import com.dev2prod.ticket.articlepachat.service.ArticlePachatService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/articlePachats")
public class ArticlePachatController {

    @Autowired
    private ArticlePachatService service;

    @GetMapping
    public List<ArticlePachatEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ArticlePachatEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public ArticlePachatEntity create(@RequestBody ArticlePachatEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ArticlePachatEntity update(@PathVariable Integer id, @RequestBody ArticlePachatEntity entity) {
        ArticlePachatEntity existing = service.getById(id);
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
