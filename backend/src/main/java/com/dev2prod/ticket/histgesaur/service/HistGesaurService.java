package com.dev2prod.ticket.histgesaur.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.histgesaur.entity.HistGesaurEntity;
import com.dev2prod.ticket.histgesaur.repository.HistGesaurRepository;

import java.util.List;

@Service
public class HistGesaurService {
    @Autowired
    private HistGesaurRepository repository;

    public List<HistGesaurEntity> getAll() {
        return repository.findAll();
    }

    public HistGesaurEntity getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public HistGesaurEntity save(HistGesaurEntity entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<HistGesaurEntity> findByCaissier(String caissier) {
        return repository.findByCaissier(caissier);
    }

    // ... ajouter d'autres méthodes selon les besoins
}
