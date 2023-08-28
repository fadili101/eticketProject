package com.dev2prod.ticket.realisesannuelles.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dev2prod.ticket.realisesannuelles.entity.RealisesAnnuellesEntity;
import com.dev2prod.ticket.realisesannuelles.service.RealisesAnnuellesService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/realisesAnnuelles")
public class RealisesAnnuellesController {

    @Autowired
    private RealisesAnnuellesService service;

    @GetMapping
    public List<RealisesAnnuellesEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public RealisesAnnuellesEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public RealisesAnnuellesEntity create(@RequestBody RealisesAnnuellesEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public RealisesAnnuellesEntity update(@PathVariable Integer id, @RequestBody RealisesAnnuellesEntity entity) {
        RealisesAnnuellesEntity existing = service.getById(id);
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
