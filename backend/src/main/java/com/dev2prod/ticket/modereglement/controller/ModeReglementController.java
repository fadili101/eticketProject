package com.dev2prod.ticket.modereglement.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dev2prod.ticket.modereglement.entity.ModeReglementEntity;
import com.dev2prod.ticket.modereglement.service.ModeReglementService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/mode-reglements")
public class ModeReglementController {

    @Autowired
    private ModeReglementService service;

    @GetMapping
    public List<ModeReglementEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ModeReglementEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public ModeReglementEntity create(@RequestBody ModeReglementEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ModeReglementEntity update(@PathVariable Integer id, @RequestBody ModeReglementEntity entity) {
        ModeReglementEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdModeReglement(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
