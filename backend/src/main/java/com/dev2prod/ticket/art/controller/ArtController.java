package com.dev2prod.ticket.art.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev2prod.ticket.art.entity.ArtEntity;
import com.dev2prod.ticket.art.service.ArtService;

import java.util.List;

@RestController
public class ArtController {
    @Autowired
    private ArtService artService;

    @GetMapping("/arts")
    public List<ArtEntity> getAllArts() {
        return artService.getAllArts();
    }

    @GetMapping("/arts/{id}")
    public ArtEntity getArtById(@PathVariable Integer id) {
        return artService.getArtById(id);
    }

    @GetMapping("/arts/cpt/{cpt}")
    public List<ArtEntity> getArtByCpt(@PathVariable String cpt) {
        return artService.getArtByCpt(cpt);
    }

    @PostMapping("/arts")
    public ArtEntity createArt(@RequestBody ArtEntity art) {
        return artService.saveArt(art);
    }

    @PutMapping("/arts/{id}")
    public ArtEntity updateArt(@PathVariable Integer id, @RequestBody ArtEntity art) {
        return artService.updateArt(id, art);
    }

    @DeleteMapping("/arts/{id}")
    public void deleteArt(@PathVariable Integer id) {
        artService.deleteArt(id);
    }
}
