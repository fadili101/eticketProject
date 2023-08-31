package com.dev2prod.ticket.typedepartement.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.typedepartement.entity.TypeDepartementEntity;
import com.dev2prod.ticket.typedepartement.service.TypeDepartementService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/typeDepartements")
public class TypeDepartementController {

    @Autowired
    private TypeDepartementService service;

    @GetMapping
    public List<TypeDepartementEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public TypeDepartementEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public TypeDepartementEntity create(@RequestBody TypeDepartementEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public TypeDepartementEntity update(@PathVariable Integer id, @RequestBody TypeDepartementEntity entity) {
        // Assurez-vous que l'entité existe avant de la mettre à jour
        if (service.getById(id) == null) {
            return null;
        }
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    // Ajoutez d'autres méthodes si nécessaire
}
