package com.dev2prod.ticket.articletarifclient.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.articletarifclient.entity.ArticleTarifClientEntity;
import com.dev2prod.ticket.articletarifclient.repository.ArticleTarifClientRepository;

import java.util.List;

@Service
public class ArticleTarifClientService {

    @Autowired
    private ArticleTarifClientRepository repository;

    public List<ArticleTarifClientEntity> getAll() {
        return repository.findAll();
    }

    public ArticleTarifClientEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public ArticleTarifClientEntity save(ArticleTarifClientEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
