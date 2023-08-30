package com.dev2prod.ticket.articletarifjournee.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.articletarifclient.entity.ArticleTarifClientEntity;
import com.dev2prod.ticket.articletarifclient.service.ArticleTarifClientService;
import com.dev2prod.ticket.articletarifjournee.entity.ArticleTarifJourneeEntity;
import com.dev2prod.ticket.articletarifjournee.service.ArticleTarifJourneeService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/article-tarif-journees")
public class ArticleTarifJourneeController {

    @Autowired
    private ArticleTarifJourneeService service;

    @GetMapping
    public List<ArticleTarifJourneeEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ArticleTarifJourneeEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public ArticleTarifJourneeEntity create(@RequestBody ArticleTarifJourneeEntity entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ArticleTarifJourneeEntity update(@PathVariable Integer id, @RequestBody ArticleTarifJourneeEntity entity) {
        ArticleTarifJourneeEntity existing = service.getById(id);
        if (existing != null) {
            entity.setIdTarifJournee(id);
            return service.save(entity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
