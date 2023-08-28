package com.dev2prod.ticket.profile.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dev2prod.ticket.profile.entity.ProfilEntity;
import com.dev2prod.ticket.profile.repository.ProfilRepository;

import java.util.List;


@Service
public class ProfilService {

    @Autowired
    private ProfilRepository repository;

    public List<ProfilEntity> getAll() {
        return repository.findAll();
    }

    public ProfilEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public ProfilEntity save(ProfilEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
