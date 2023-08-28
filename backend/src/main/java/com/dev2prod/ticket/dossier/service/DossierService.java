package com.dev2prod.ticket.dossier.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.dossier.entity.DossierEntity;
import com.dev2prod.ticket.dossier.repository.DossierRepository;

import java.util.List;


@Service
public class DossierService {

    @Autowired
    private DossierRepository repository;

    public List<DossierEntity> getAll() {
        return repository.findAll();
    }

    public DossierEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<DossierEntity> getByDossier(String dossier) {
        return repository.findByDossier(dossier);
    }

    public DossierEntity save(DossierEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
