package com.dev2prod.ticket.accessalarie.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.accessalarie.entity.AccesSalarieEntity;
import com.dev2prod.ticket.accessalarie.service.AccesSalarieService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/acces-salarie")
public class AccesSalarieController {
    @Autowired
    private AccesSalarieService service;

    @GetMapping
    public List<AccesSalarieEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public AccesSalarieEntity getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("/exercice/{idAccesExercice}")
    public List<AccesSalarieEntity> findByIdAccesExercice(@PathVariable Long idAccesExercice) {
        return service.findByIdAccesExercice(idAccesExercice);
    }

    @PostMapping
    public AccesSalarieEntity create(@RequestBody AccesSalarieEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public AccesSalarieEntity update(@PathVariable Long id, @RequestBody AccesSalarieEntity entity) {
        AccesSalarieEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdAccesSalarie(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
