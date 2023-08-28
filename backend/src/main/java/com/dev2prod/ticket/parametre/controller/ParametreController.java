package com.dev2prod.ticket.parametre.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dev2prod.ticket.parametre.entity.ParametreEntity;
import com.dev2prod.ticket.parametre.service.ParametreService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/parametres")
public class ParametreController {

    @Autowired
    private ParametreService service;

    @GetMapping
    public List<ParametreEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ParametreEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public ParametreEntity create(@RequestBody ParametreEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ParametreEntity update(@PathVariable Integer id, @RequestBody ParametreEntity entity) {
        ParametreEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdParametre(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
