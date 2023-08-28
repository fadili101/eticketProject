package com.dev2prod.ticket.previsionannuelle.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dev2prod.ticket.previsionannuelle.entity.PrevisionAnnuelleEntity;
import com.dev2prod.ticket.previsionannuelle.service.PrevisionAnnuelleService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/previsionAnnuelles")
public class PrevisionAnnuelleController {

    @Autowired
    private PrevisionAnnuelleService service;

    @GetMapping
    public List<PrevisionAnnuelleEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public PrevisionAnnuelleEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public PrevisionAnnuelleEntity create(@RequestBody PrevisionAnnuelleEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public PrevisionAnnuelleEntity update(@PathVariable Integer id, @RequestBody PrevisionAnnuelleEntity entity) {
        PrevisionAnnuelleEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdLigne(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
