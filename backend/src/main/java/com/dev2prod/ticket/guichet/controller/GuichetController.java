package com.dev2prod.ticket.guichet.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.guichet.entity.GuichetEntity;
import com.dev2prod.ticket.guichet.service.GuichetService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/guichets")
public class GuichetController {

    @Autowired
    private GuichetService service;

    @GetMapping
    public List<GuichetEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public GuichetEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public GuichetEntity create(@RequestBody GuichetEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public GuichetEntity update(@PathVariable Integer id, @RequestBody GuichetEntity entity) {
        GuichetEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdGuichet(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
