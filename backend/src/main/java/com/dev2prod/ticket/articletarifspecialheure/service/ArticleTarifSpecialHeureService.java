package com.dev2prod.ticket.articletarifspecialheure.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.articletarifspecialheure.entity.ArticleTarifSpecialHeureEntity;
import com.dev2prod.ticket.articletarifspecialheure.repository.ArticleTarifSpecialHeureRepository;

import java.util.List;

@Service
public class ArticleTarifSpecialHeureService {

    @Autowired
    private ArticleTarifSpecialHeureRepository repository;

    public List<ArticleTarifSpecialHeureEntity> getAll() {
        return repository.findAll();
    }

    public ArticleTarifSpecialHeureEntity getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public ArticleTarifSpecialHeureEntity save(ArticleTarifSpecialHeureEntity entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
