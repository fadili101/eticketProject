package com.dev2prod.ticket.article11.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.article11.entity.Article11Entity;
import com.dev2prod.ticket.article11.service.Article11Service;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/articles11")
public class Article11Controller {

    @Autowired
    private Article11Service service;

    @GetMapping
    public List<Article11Entity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Article11Entity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public Article11Entity create(@RequestBody Article11Entity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public Article11Entity update(@PathVariable Integer id, @RequestBody Article11Entity entity) {
        Article11Entity existing = service.getById(id);
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
