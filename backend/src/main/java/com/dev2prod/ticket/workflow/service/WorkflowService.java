package com.dev2prod.ticket.workflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.workflow.entity.WorkflowEntity;
import com.dev2prod.ticket.workflow.repository.WorkflowRepository;

@Service
public class WorkflowService {

    @Autowired
    private WorkflowRepository workflowRepository;

    public List<WorkflowEntity> getWorkflows() {
        return workflowRepository.findAll();
    }

    public WorkflowEntity getWorkflowById(Long id) {
        return workflowRepository.findById(id).orElse(null);
    }

    public WorkflowEntity saveWorkflow(WorkflowEntity workflow) {
        return workflowRepository.save(workflow);
    }

    public void deleteWorkflow(Long id) {
        workflowRepository.deleteById(id);
    }

    // Ajoutez d'autres méthodes de service si nécessaire.
}
