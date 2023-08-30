package com.dev2prod.ticket.abonnementligneaccespointage.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.abonnementligneaccespointage.entity.AbonnementLigneAccesPointageEntity;
import com.dev2prod.ticket.abonnementligneaccespointage.service.AbonnementLigneAccesPointageService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/abonnementLigneAccesPointage")
public class AbonnementLigneAccesPointageController {

    @Autowired
    private AbonnementLigneAccesPointageService service;

    @GetMapping
    public List<AbonnementLigneAccesPointageEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public AbonnementLigneAccesPointageEntity getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public AbonnementLigneAccesPointageEntity create(@RequestBody AbonnementLigneAccesPointageEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public AbonnementLigneAccesPointageEntity update(@PathVariable Long id, @RequestBody AbonnementLigneAccesPointageEntity entity) {
        AbonnementLigneAccesPointageEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdAbonnementLigneAccesPointage(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
