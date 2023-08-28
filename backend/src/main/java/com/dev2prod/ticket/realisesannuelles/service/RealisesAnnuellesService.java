package com.dev2prod.ticket.realisesannuelles.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.realisesannuelles.entity.RealisesAnnuellesEntity;
import com.dev2prod.ticket.realisesannuelles.repository.RealisesAnnuellesRepository;

import java.util.List;


@Service
public class RealisesAnnuellesService {

    @Autowired
    private RealisesAnnuellesRepository repository;

    public List<RealisesAnnuellesEntity> getAll() {
        return repository.findAll();
    }

    public RealisesAnnuellesEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public RealisesAnnuellesEntity save(RealisesAnnuellesEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
