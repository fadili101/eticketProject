package com.dev2prod.ticket.workflowe.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.workflowe.entity.WorkFlowEntity;
import com.dev2prod.ticket.workflowe.service.WorkFlowService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/workflow")
public class WorkFlowController {

    @Autowired
    private WorkFlowService service;

    @GetMapping
    public List<WorkFlowEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public WorkFlowEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public WorkFlowEntity create(@RequestBody WorkFlowEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public WorkFlowEntity update(@PathVariable Integer id, @RequestBody WorkFlowEntity entity) {
        WorkFlowEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdWorkFlow(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
