package com.dev2prod.ticket.workflowdetail.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dev2prod.ticket.workflowdetail.entity.WorkFlowDetailEntity;
import com.dev2prod.ticket.workflowdetail.repository.WorkFlowDetailRepository;

import java.util.List;

@Service
public class WorkFlowDetailService {

    @Autowired
    private WorkFlowDetailRepository repository;

    public List<WorkFlowDetailEntity> getAll() {
        return repository.findAll();
    }

    public WorkFlowDetailEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public WorkFlowDetailEntity save(WorkFlowDetailEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
