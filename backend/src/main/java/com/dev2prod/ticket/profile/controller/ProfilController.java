package com.dev2prod.ticket.profile.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dev2prod.ticket.profile.entity.ProfilEntity;
import com.dev2prod.ticket.profile.service.ProfilService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/profils")
public class ProfilController {

    @Autowired
    private ProfilService service;

    @GetMapping
    public List<ProfilEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ProfilEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public ProfilEntity create(@RequestBody ProfilEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ProfilEntity update(@PathVariable Integer id, @RequestBody ProfilEntity entity) {
        ProfilEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdProfil(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
