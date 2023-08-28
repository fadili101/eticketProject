package com.dev2prod.ticket.champcomptable.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.champcomptable.entity.ChampComptableEntity;
import com.dev2prod.ticket.champcomptable.repository.ChampComptableRepository;

import java.util.List;


@Service
public class ChampComptableService {
    @Autowired
    private ChampComptableRepository repository;

    public List<ChampComptableEntity> getAll() {
        return repository.findAll();
    }

    public ChampComptableEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<ChampComptableEntity> findByNomChamp(String nomChamp) {
        return repository.findByNomChamp(nomChamp);
    }

    public ChampComptableEntity save(ChampComptableEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
