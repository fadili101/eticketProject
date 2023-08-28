package com.dev2prod.ticket.statutworkFfow.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dev2prod.ticket.statutworkFfow.entity.StatutWorkFlowEntity;
import com.dev2prod.ticket.statutworkFfow.repository.StatutWorkFlowRepository;

import java.util.List;

@Service
public class StatutWorkFlowService {

    @Autowired
    private StatutWorkFlowRepository repository;

    public List<StatutWorkFlowEntity> getAll() {
        return repository.findAll();
    }

    public StatutWorkFlowEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public StatutWorkFlowEntity save(StatutWorkFlowEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
