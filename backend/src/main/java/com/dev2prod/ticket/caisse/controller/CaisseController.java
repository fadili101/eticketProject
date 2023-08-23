package com.dev2prod.ticket.caisse.controller;

import com.dev2prod.ticket.caisse.entity.CaisseEntity;
import com.dev2prod.ticket.caisse.service.CaisseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/caisse")
public class CaisseController {

    @Autowired
    private CaisseService caisseService;

    @GetMapping("/getCaisses")
    public List<CaisseEntity> getAllCaisses() {
        return caisseService.getAllCaisseDetails();
    }
    @GetMapping("/{caisseId}")
    public CaisseEntity getCaisseById(@PathVariable Long caisseId) {
        return caisseService.getCaisseDetailsById(caisseId);
    }
    @PostMapping("/save")
    public ResponseEntity createCaisse(@RequestBody CaisseEntity caisseObj) {
        caisseService.saveCaisse(caisseObj);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{caisseId}")
    public ResponseEntity removeCaisse(@PathVariable Long caisseId) {
        caisseService.deleteCaisse(caisseId);
        return new ResponseEntity(HttpStatus.OK);
    }
    
    @PutMapping("/update/{caisseId}")
    public ResponseEntity updateCaisse(@PathVariable Long caisseId, @RequestBody CaisseEntity caisseObj) {
        if (caisseService.updateCaisse(caisseId, caisseObj)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}
