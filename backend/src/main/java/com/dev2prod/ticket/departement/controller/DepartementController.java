package com.dev2prod.ticket.departement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.dev2prod.ticket.departement.entity.DepartementEntity;
import com.dev2prod.ticket.departement.service.DepartementService;

@CrossOrigin
@RestController
@RequestMapping("/departement")
public class DepartementController {
    @Autowired
    private DepartementService service;

    @GetMapping
    public List<DepartementEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public DepartementEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @GetMapping("/byname/{departement}")
    public List<DepartementEntity> getByDepartement(@PathVariable String departement) {
        return service.getByDepartement(departement);
    }

    @PostMapping
    public DepartementEntity create(@RequestBody DepartementEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public DepartementEntity update(@PathVariable Integer id, @RequestBody DepartementEntity entity) {
        DepartementEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdDepartement(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
