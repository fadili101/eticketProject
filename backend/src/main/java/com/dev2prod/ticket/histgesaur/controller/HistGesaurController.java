package com.dev2prod.ticket.histgesaur.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.histgesaur.entity.HistGesaurEntity;
import com.dev2prod.ticket.histgesaur.service.HistGesaurService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/histgesaur")
public class HistGesaurController {
    @Autowired
    private HistGesaurService service;

    @GetMapping
    public List<HistGesaurEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public HistGesaurEntity getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("/caissier/{caissier}")
    public List<HistGesaurEntity> findByCaissier(@PathVariable String caissier) {
        return service.findByCaissier(caissier);
    }

    @PostMapping
    public HistGesaurEntity create(@RequestBody HistGesaurEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public HistGesaurEntity update(@PathVariable Long id, @RequestBody HistGesaurEntity entity) {
        HistGesaurEntity existing = service.getById(id);
        if (existing != null) {
            entity.setNLigne(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    // ... ajouter d'autres méthodes selon les besoins
}
