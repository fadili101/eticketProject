package com.dev2prod.ticket.parametretype.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.parametretype.entity.ParametreTypeEntity;
import com.dev2prod.ticket.parametretype.service.ParametreTypeService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/parametreTypes")
public class ParametreTypeController {

    @Autowired
    private ParametreTypeService service;

    @GetMapping
    public List<ParametreTypeEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ParametreTypeEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public ParametreTypeEntity create(@RequestBody ParametreTypeEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ParametreTypeEntity update(@PathVariable Integer id, @RequestBody ParametreTypeEntity entity) {
        ParametreTypeEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdParametreType(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
