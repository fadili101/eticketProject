package com.dev2prod.ticket.abonnementligne.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.abonnementligne.entity.AbonnementLigneEntity;
import com.dev2prod.ticket.abonnementligne.service.AbonnementLigneService;


import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/abonnementLigne")
public class AbonnementLigneController {

    @Autowired
    private AbonnementLigneService service;

    @GetMapping
    public List<AbonnementLigneEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public AbonnementLigneEntity getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public AbonnementLigneEntity create(@RequestBody AbonnementLigneEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public AbonnementLigneEntity update(@PathVariable Long id, @RequestBody AbonnementLigneEntity entity) {
        AbonnementLigneEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdAbonnementLigne(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
