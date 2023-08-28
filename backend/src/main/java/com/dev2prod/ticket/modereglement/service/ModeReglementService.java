package com.dev2prod.ticket.modereglement.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.modereglement.entity.ModeReglementEntity;
import com.dev2prod.ticket.modereglement.repository.ModeReglementRepository;

import java.util.List;


@Service
public class ModeReglementService {

    @Autowired
    private ModeReglementRepository repository;

    public List<ModeReglementEntity> getAll() {
        return repository.findAll();
    }

    public ModeReglementEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public ModeReglementEntity save(ModeReglementEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
