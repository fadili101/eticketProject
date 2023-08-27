package com.dev2prod.ticket.art.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.art.entity.ArtEntity;
import com.dev2prod.ticket.art.repository.ArtRepository;

import java.util.List;

@Service
public class ArtService {
    @Autowired
    private ArtRepository artRepository;

    public List<ArtEntity> getAllArts() {
        return artRepository.findAll();
    }

    public ArtEntity getArtById(Integer id) {
        return artRepository.findById(id).orElse(null);
    }

    public ArtEntity saveArt(ArtEntity art) {
        return artRepository.save(art);
    }

    public void deleteArt(Integer id) {
        artRepository.deleteById(id);
    }

    public ArtEntity updateArt(Integer id, ArtEntity art) {
        if (artRepository.existsById(id)) {
            art.setIdart(id);
            return artRepository.save(art);
        }
        return null;
    }

    public List<ArtEntity> getArtByCpt(String cpt) {
        return artRepository.findByCpt(cpt);
    }
}
