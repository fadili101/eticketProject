package com.dev2prod.ticket.ecran.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.ecran.entity.EcranEntity;
import com.dev2prod.ticket.ecran.repository.EcranRepository;

import java.util.List;

@Service
public class EcranService {

    @Autowired
    private EcranRepository repository;

    public List<EcranEntity> getAll() {
        return repository.findAll();
    }

    public EcranEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public EcranEntity save(EcranEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
