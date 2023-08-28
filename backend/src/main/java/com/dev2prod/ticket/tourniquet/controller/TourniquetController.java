package com.dev2prod.ticket.tourniquet.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.tourniquet.entity.TourniquetEntity;
import com.dev2prod.ticket.tourniquet.service.TourniquetService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/tourniquet")
public class TourniquetController {

    @Autowired
    private TourniquetService service;

    @GetMapping
    public List<TourniquetEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public TourniquetEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public TourniquetEntity create(@RequestBody TourniquetEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public TourniquetEntity update(@PathVariable Integer id, @RequestBody TourniquetEntity entity) {
        TourniquetEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdTourniquet(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
