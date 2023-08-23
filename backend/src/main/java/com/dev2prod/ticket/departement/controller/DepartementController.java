package com.dev2prod.ticket.departement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev2prod.ticket.departement.entity.DepartementEntity;
import com.dev2prod.ticket.departement.service.DepartementService;

@RestController
@RequestMapping("/departements")
public class DepartementController {

    @Autowired
    private DepartementService departementService;

    @GetMapping("/getdepartements")
    public List<DepartementEntity> getAllDepartements() {
        return departementService.getAllDepartements();
    }

    @GetMapping("/{id}")
    public DepartementEntity getDepartementById(@PathVariable Long id) {
        return departementService.getDepartementById(id);
    }

    @PostMapping("/save")
    public DepartementEntity saveDepartement(@RequestBody DepartementEntity departement) {
        return departementService.saveDepartement(departement);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDepartement(@PathVariable Long id) {
        departementService.deleteDepartement(id);
        return ResponseEntity.ok().build();
    }

    // Ajoutez d'autres méthodes de contrôleur si nécessaire.
}
