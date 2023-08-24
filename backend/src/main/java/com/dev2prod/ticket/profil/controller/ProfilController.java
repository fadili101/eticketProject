package com.dev2prod.ticket.profil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.profil.entity.ProfilEntity;
import com.dev2prod.ticket.profil.service.ProfilService;
import java.util.List;


@RestController
@RequestMapping("/profil")
@CrossOrigin
public class ProfilController {

    @Autowired
    private ProfilService profilService;

    @GetMapping("/{profilId}")
    public ResponseEntity<ProfilEntity> getProfilById(@PathVariable Long profilId) {
        ProfilEntity profil = profilService.getProfilById(profilId);
        if(profil != null) {
            return new ResponseEntity<>(profil, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getProfils")
    public List<ProfilEntity> getAllProfils() {
        return profilService.getAllProfils();
    }

    @PostMapping("/save")
    public ResponseEntity<ProfilEntity> saveProfil(@RequestBody ProfilEntity profilObj) {
        ProfilEntity createdProfil = profilService.saveProfil(profilObj);
        return new ResponseEntity<>(createdProfil, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{profilId}")
    public ResponseEntity<Void> deleteProfil(@PathVariable Long profilId) {
        profilService.deleteProfil(profilId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update/{profilId}")
    public ResponseEntity updateProfil(@PathVariable Long profilId, @RequestBody ProfilEntity profilObj) {
        if (profilService.updateProfil(profilId, profilObj)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
    // Si nécessaire, ajoutez d'autres méthodes pour gérer des cas d'utilisation spécifiques
}
