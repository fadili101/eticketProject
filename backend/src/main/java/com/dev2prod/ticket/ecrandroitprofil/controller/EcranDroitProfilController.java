package com.dev2prod.ticket.ecrandroitprofil.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.ecrandroitprofil.entity.EcranDroitProfilEntity;
import com.dev2prod.ticket.ecrandroitprofil.service.EcranDroitProfilService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/ecranDroitProfil")
public class EcranDroitProfilController {

    @Autowired
    private EcranDroitProfilService service;

    @GetMapping
    public List<EcranDroitProfilEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public EcranDroitProfilEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public EcranDroitProfilEntity create(@RequestBody EcranDroitProfilEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public EcranDroitProfilEntity update(@PathVariable Integer id, @RequestBody EcranDroitProfilEntity entity) {
        EcranDroitProfilEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdEcranDroit(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
