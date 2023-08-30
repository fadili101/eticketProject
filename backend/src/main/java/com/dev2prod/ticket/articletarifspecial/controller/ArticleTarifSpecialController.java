package com.dev2prod.ticket.articletarifspecial.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.articletarifspecial.entity.ArticleTarifSpecialEntity;
import com.dev2prod.ticket.articletarifspecial.service.ArticleTarifSpecialService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/article-tarif-specials")
public class ArticleTarifSpecialController {

    @Autowired
    private ArticleTarifSpecialService service;

    @GetMapping
    public List<ArticleTarifSpecialEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ArticleTarifSpecialEntity getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public ArticleTarifSpecialEntity create(@RequestBody ArticleTarifSpecialEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ArticleTarifSpecialEntity update(@PathVariable Long id, @RequestBody ArticleTarifSpecialEntity entity) {
        ArticleTarifSpecialEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdTarif(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
