package com.dev2prod.ticket.controleur.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.controleur.entity.ControleurEntity;
import com.dev2prod.ticket.controleur.service.ControleurService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/controleur")
public class ControleurController {
    @Autowired
    private ControleurService service;

    @GetMapping
    public List<ControleurEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ControleurEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @GetMapping("/marque/{marque}")
    public List<ControleurEntity> getByMarque(@PathVariable String marque) {
        return service.getByMarque(marque);
    }

    @PostMapping
    public ControleurEntity create(@RequestBody ControleurEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ControleurEntity update(@PathVariable Integer id, @RequestBody ControleurEntity entity) {
        ControleurEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdControleur(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
