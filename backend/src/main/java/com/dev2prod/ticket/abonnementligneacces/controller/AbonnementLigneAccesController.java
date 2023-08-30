package com.dev2prod.ticket.abonnementligneacces.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.abonnementligneacces.entity.AbonnementLigneAccesEntity;
import com.dev2prod.ticket.abonnementligneacces.service.AbonnementLigneAccesService;


import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/abonnementLigneAcces")
public class AbonnementLigneAccesController {

    @Autowired
    private AbonnementLigneAccesService service;

    @GetMapping
    public List<AbonnementLigneAccesEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public AbonnementLigneAccesEntity getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public AbonnementLigneAccesEntity create(@RequestBody AbonnementLigneAccesEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public AbonnementLigneAccesEntity update(@PathVariable Long id, @RequestBody AbonnementLigneAccesEntity entity) {
        AbonnementLigneAccesEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdAbonnementLigneAcces(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
