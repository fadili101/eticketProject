package com.dev2prod.ticket.clavier.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.dev2prod.ticket.clavier.entity.ClavierEntity;
import com.dev2prod.ticket.clavier.service.ClavierService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/clavier")
public class ClavierController {
    @Autowired
    private ClavierService service;

    @GetMapping
    public List<ClavierEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ClavierEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @GetMapping("/libelle/{libelle}")
    public ClavierEntity getByLibelle(@PathVariable String libelle) {
        return service.getByLibelle(libelle);
    }

    @PostMapping
    public ClavierEntity create(@RequestBody ClavierEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ClavierEntity update(@PathVariable Integer id, @RequestBody ClavierEntity entity) {
        ClavierEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdNum(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
