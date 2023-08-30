package com.dev2prod.ticket.articletarifclient.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.articletarifclient.entity.ArticleTarifClientEntity;
import com.dev2prod.ticket.articletarifclient.service.ArticleTarifClientService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/article-tarif-clients")
public class ArticleTarifClientController {

    @Autowired
    private ArticleTarifClientService service;

    @GetMapping
    public List<ArticleTarifClientEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ArticleTarifClientEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public ArticleTarifClientEntity create(@RequestBody ArticleTarifClientEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ArticleTarifClientEntity update(@PathVariable Integer id, @RequestBody ArticleTarifClientEntity entity) {
        ArticleTarifClientEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdTarifClient(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
