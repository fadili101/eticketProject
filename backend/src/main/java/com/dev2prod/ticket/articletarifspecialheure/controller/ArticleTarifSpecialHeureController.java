package com.dev2prod.ticket.articletarifspecialheure.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dev2prod.ticket.articletarifspecialheure.entity.ArticleTarifSpecialHeureEntity;
import com.dev2prod.ticket.articletarifspecialheure.service.ArticleTarifSpecialHeureService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/article-tarif-special-heures")
public class ArticleTarifSpecialHeureController {

    @Autowired
    private ArticleTarifSpecialHeureService service;

    @GetMapping
    public List<ArticleTarifSpecialHeureEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ArticleTarifSpecialHeureEntity getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public ArticleTarifSpecialHeureEntity create(@RequestBody ArticleTarifSpecialHeureEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ArticleTarifSpecialHeureEntity update(@PathVariable Long id, @RequestBody ArticleTarifSpecialHeureEntity entity) {
        ArticleTarifSpecialHeureEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdTarifHeure(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
