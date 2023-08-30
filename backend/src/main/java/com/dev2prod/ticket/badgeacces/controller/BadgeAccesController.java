package com.dev2prod.ticket.badgeacces.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.badgeacces.entity.BadgeAccesEntity;
import com.dev2prod.ticket.badgeacces.service.BadgeAccesService;


import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/badgeAcces")
public class BadgeAccesController {

    @Autowired
    private BadgeAccesService service;

    @GetMapping
    public List<BadgeAccesEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public BadgeAccesEntity getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public BadgeAccesEntity create(@RequestBody BadgeAccesEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public BadgeAccesEntity update(@PathVariable Long id, @RequestBody BadgeAccesEntity entity) {
        BadgeAccesEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdBadgeAcces(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
