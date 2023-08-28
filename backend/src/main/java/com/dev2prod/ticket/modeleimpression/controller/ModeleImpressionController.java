package com.dev2prod.ticket.modeleimpression.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.modeleimpression.entity.ModeleImpressionEntity;
import com.dev2prod.ticket.modeleimpression.service.ModeleImpressionService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/modele-impressions")
public class ModeleImpressionController {

    @Autowired
    private ModeleImpressionService service;

    @GetMapping
    public List<ModeleImpressionEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ModeleImpressionEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public ModeleImpressionEntity create(@RequestBody ModeleImpressionEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ModeleImpressionEntity update(@PathVariable Integer id, @RequestBody ModeleImpressionEntity entity) {
        ModeleImpressionEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdModeleImpression(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
