package com.dev2prod.ticket.caisseparametre.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.caisseparametre.entity.CaisseParametreEntity;
import com.dev2prod.ticket.caisseparametre.service.CaisseParametreService;

import java.util.List;

@RestController
@RequestMapping("/caisseparametre")
public class CaisseParametreController {
    @Autowired
    private CaisseParametreService service;

    @GetMapping
    public List<CaisseParametreEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public CaisseParametreEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public CaisseParametreEntity create(@RequestBody CaisseParametreEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public CaisseParametreEntity update(@PathVariable Integer id, @RequestBody CaisseParametreEntity entity) {
        CaisseParametreEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdCaisse(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
