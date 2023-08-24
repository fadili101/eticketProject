package com.dev2prod.ticket.workflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev2prod.ticket.workflow.entity.WorkflowEntity;
import com.dev2prod.ticket.departement.service.DepartementService;
import com.dev2prod.ticket.workflow.service.WorkflowService;

@RestController
@RequestMapping("/workfow")
@CrossOrigin
public class WorkflowController {

    @Autowired
    private WorkflowService workflowService;

    @GetMapping("/getworkflow")
    public List<WorkflowEntity> getAllworkflows() {
        return workflowService.getWorkflows();
    }

    @GetMapping("/{id}")
    public WorkflowEntity getWorkflowById(@PathVariable Long id) {
        return workflowService.getWorkflowById(id);
    }

    @PostMapping("/save")
    public WorkflowEntity saveWorkflow(@RequestBody WorkflowEntity wf) {
        return workflowService.saveWorkflow(wf);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteWorkflow(@PathVariable Long id) {
        workflowService.deleteWorkflow(id);
        return ResponseEntity.ok().build();
    }

    // Ajoutez d'autres méthodes de contrôleur si nécessaire.
}
