package com.dev2prod.ticket.workflowe.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.workflowe.entity.WorkFlowEntity;
import com.dev2prod.ticket.workflowe.repository.WorkFlowRepository;

import java.util.List;


@Service
public class WorkFlowService {

    @Autowired
    private WorkFlowRepository repository;

    public List<WorkFlowEntity> getAll() {
        return repository.findAll();
    }

    public WorkFlowEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public WorkFlowEntity save(WorkFlowEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
