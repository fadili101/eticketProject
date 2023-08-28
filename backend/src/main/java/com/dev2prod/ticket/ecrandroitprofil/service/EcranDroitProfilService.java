package com.dev2prod.ticket.ecrandroitprofil.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.ecrandroitprofil.entity.EcranDroitProfilEntity;
import com.dev2prod.ticket.ecrandroitprofil.repository.EcranDroitProfilRepository;

import java.util.List;

@Service
public class EcranDroitProfilService {

    @Autowired
    private EcranDroitProfilRepository repository;

    public List<EcranDroitProfilEntity> getAll() {
        return repository.findAll();
    }

    public EcranDroitProfilEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public EcranDroitProfilEntity save(EcranDroitProfilEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
