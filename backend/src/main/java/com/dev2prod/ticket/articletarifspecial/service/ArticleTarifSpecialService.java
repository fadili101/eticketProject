package com.dev2prod.ticket.articletarifspecial.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.articletarifspecial.entity.ArticleTarifSpecialEntity;
import com.dev2prod.ticket.articletarifspecial.repository.ArticleTarifSpecialRepository;

import java.util.List;


@Service
public class ArticleTarifSpecialService {

    @Autowired
    private ArticleTarifSpecialRepository repository;

    public List<ArticleTarifSpecialEntity> getAll() {
        return repository.findAll();
    }

    public ArticleTarifSpecialEntity getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public ArticleTarifSpecialEntity save(ArticleTarifSpecialEntity entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
