package com.dev2prod.ticket.accesexercice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.accesexercice.entity.AccesExerciceEntity;
import com.dev2prod.ticket.accesexercice.service.AccesExerciceService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/accesexercice")
public class AccesExerciceController {
    @Autowired
    private AccesExerciceService service;

    @GetMapping
    public List<AccesExerciceEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public AccesExerciceEntity getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("/annee/{annee}")
    public List<AccesExerciceEntity> getByAnnee(@PathVariable Integer annee) {
        return service.getByAnnee(annee);
    }

    @PostMapping
    public AccesExerciceEntity create(@RequestBody AccesExerciceEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public AccesExerciceEntity update(@PathVariable Long id, @RequestBody AccesExerciceEntity entity) {
        AccesExerciceEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdAccesExercice(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
