package com.dev2prod.ticket.tourniquet.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.tourniquet.entity.TourniquetEntity;
import com.dev2prod.ticket.tourniquet.repository.TourniquetRepository;

import java.util.List;


@Service
public class TourniquetService {

    @Autowired
    private TourniquetRepository repository;

    public List<TourniquetEntity> getAll() {
        return repository.findAll();
    }

    public TourniquetEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public TourniquetEntity save(TourniquetEntity entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
