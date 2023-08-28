package com.dev2prod.ticket.dossier.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.dossier.entity.DossierEntity;
import com.dev2prod.ticket.dossier.service.DossierService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/dossier")
public class DossierController {

    @Autowired
    private DossierService service;

    @GetMapping
    public List<DossierEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public DossierEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @GetMapping("/byname/{dossier}")
    public List<DossierEntity> getByDossier(@PathVariable String dossier) {
        return service.getByDossier(dossier);
    }

    @PostMapping
    public DossierEntity create(@RequestBody DossierEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public DossierEntity update(@PathVariable Integer id, @RequestBody DossierEntity entity) {
        DossierEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdDossier(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
