package com.dev2prod.ticket.abonnement.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.abonnement.entity.AbonnementEntity;
import com.dev2prod.ticket.abonnement.service.AbonnementService;


import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/abonnement")
public class AbonnementController {

    @Autowired
    private AbonnementService service;

    @GetMapping
    public List<AbonnementEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public AbonnementEntity getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public AbonnementEntity create(@RequestBody AbonnementEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public AbonnementEntity update(@PathVariable Long id, @RequestBody AbonnementEntity entity) {
        AbonnementEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdAbonnement(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
