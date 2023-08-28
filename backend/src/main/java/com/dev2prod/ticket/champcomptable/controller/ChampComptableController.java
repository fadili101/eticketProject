package com.dev2prod.ticket.champcomptable.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.champcomptable.entity.ChampComptableEntity;
import com.dev2prod.ticket.champcomptable.service.ChampComptableService;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/champ-comptable")
public class ChampComptableController {
    @Autowired
    private ChampComptableService service;

    @GetMapping
    public List<ChampComptableEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ChampComptableEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @GetMapping("/nom/{nomChamp}")
    public List<ChampComptableEntity> findByNomChamp(@PathVariable String nomChamp) {
        return service.findByNomChamp(nomChamp);
    }

    @PostMapping
    public ChampComptableEntity create(@RequestBody ChampComptableEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ChampComptableEntity update(@PathVariable Integer id, @RequestBody ChampComptableEntity entity) {
        ChampComptableEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdChamp(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
