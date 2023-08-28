package com.dev2prod.ticket.ecran.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.ecran.entity.EcranEntity;
import com.dev2prod.ticket.ecran.service.EcranService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/ecran")
public class EcranController {

    @Autowired
    private EcranService service;

    @GetMapping
    public List<EcranEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public EcranEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public EcranEntity create(@RequestBody EcranEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public EcranEntity update(@PathVariable Integer id, @RequestBody EcranEntity entity) {
        EcranEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdEcran(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
