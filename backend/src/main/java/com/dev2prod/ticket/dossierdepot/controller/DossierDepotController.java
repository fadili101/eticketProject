package com.dev2prod.ticket.dossierdepot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.dossierdepot.entity.DossierDepotEntity;
import com.dev2prod.ticket.dossierdepot.service.DossierDepotService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/dossierDepot")
public class DossierDepotController {

    @Autowired
    private DossierDepotService service;

    @GetMapping
    public List<DossierDepotEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public DossierDepotEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @GetMapping("/byDossier/{idDossier}")
    public List<DossierDepotEntity> getByIdDossier(@PathVariable Integer idDossier) {
        return service.getByIdDossier(idDossier);
    }

    @PostMapping
    public DossierDepotEntity create(@RequestBody DossierDepotEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public DossierDepotEntity update(@PathVariable Integer id, @RequestBody DossierDepotEntity entity) {
        DossierDepotEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdDossierDepot(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
