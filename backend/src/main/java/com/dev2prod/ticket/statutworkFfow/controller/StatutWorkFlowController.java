package com.dev2prod.ticket.statutworkFfow.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dev2prod.ticket.statutworkFfow.entity.StatutWorkFlowEntity;
import com.dev2prod.ticket.statutworkFfow.service.StatutWorkFlowService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/statutWorkFlow")
public class StatutWorkFlowController {

    @Autowired
    private StatutWorkFlowService service;

    @GetMapping
    public List<StatutWorkFlowEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public StatutWorkFlowEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public StatutWorkFlowEntity create(@RequestBody StatutWorkFlowEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public StatutWorkFlowEntity update(@PathVariable Integer id, @RequestBody StatutWorkFlowEntity entity) {
        StatutWorkFlowEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdStatutWorkFlow(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
