package com.dev2prod.ticket.dossierdepot.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.dossierdepot.entity.DossierDepotEntity;
import com.dev2prod.ticket.dossierdepot.repository.DossierDepotRepository;

import java.util.List;

@Service
public class DossierDepotService {

    @Autowired
    private DossierDepotRepository repository;

    public List<DossierDepotEntity> getAll() {
        return repository.findAll();
    }

    public DossierDepotEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<DossierDepotEntity> getByIdDossier(Integer idDossier) {
        return repository.findByIdDossier(idDossier);
    }

    public DossierDepotEntity save(DossierDepotEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
