package com.dev2prod.ticket.workflowdetail.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dev2prod.ticket.workflowdetail.entity.WorkFlowDetailEntity;
import com.dev2prod.ticket.workflowdetail.service.WorkFlowDetailService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/workflowdetail")
public class WorkFlowDetailController {

    @Autowired
    private WorkFlowDetailService service;

    @GetMapping
    public List<WorkFlowDetailEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public WorkFlowDetailEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public WorkFlowDetailEntity create(@RequestBody WorkFlowDetailEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public WorkFlowDetailEntity update(@PathVariable Integer id, @RequestBody WorkFlowDetailEntity entity) {
        WorkFlowDetailEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdWorkFlowStatut(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
