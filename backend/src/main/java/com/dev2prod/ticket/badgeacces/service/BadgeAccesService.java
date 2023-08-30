package com.dev2prod.ticket.badgeacces.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.badgeacces.entity.BadgeAccesEntity;
import com.dev2prod.ticket.badgeacces.repository.BadgeAccesRepository;

import java.util.List;


@Service
public class BadgeAccesService {

    @Autowired
    private BadgeAccesRepository repository;

    public List<BadgeAccesEntity> getAll() {
        return repository.findAll();
    }

    public BadgeAccesEntity getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public BadgeAccesEntity save(BadgeAccesEntity entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
