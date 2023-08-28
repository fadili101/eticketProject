package com.dev2prod.ticket.rapport.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.rapport.entity.RapportEntity;
import com.dev2prod.ticket.rapport.service.RapportService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/rapports")
public class RapportController {

    @Autowired
    private RapportService service;

    @GetMapping
    public List<RapportEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public RapportEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public RapportEntity create(@RequestBody RapportEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public RapportEntity update(@PathVariable Integer id, @RequestBody RapportEntity entity) {
        RapportEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdRapport(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
