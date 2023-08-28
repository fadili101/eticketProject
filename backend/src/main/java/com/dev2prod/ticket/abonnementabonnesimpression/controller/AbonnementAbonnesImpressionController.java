package com.dev2prod.ticket.abonnementabonnesimpression.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.abonnementabonnesimpression.entity.AbonnementAbonnesImpressionEntity;
import com.dev2prod.ticket.abonnementabonnesimpression.service.AbonnementAbonnesImpressionService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/abonnementAbonnesImpression")
public class AbonnementAbonnesImpressionController {

    @Autowired
    private AbonnementAbonnesImpressionService service;

    @GetMapping
    public List<AbonnementAbonnesImpressionEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public AbonnementAbonnesImpressionEntity getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public AbonnementAbonnesImpressionEntity create(@RequestBody AbonnementAbonnesImpressionEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public AbonnementAbonnesImpressionEntity update(@PathVariable Long id, @RequestBody AbonnementAbonnesImpressionEntity entity) {
        AbonnementAbonnesImpressionEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdAbonnementImpression(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
