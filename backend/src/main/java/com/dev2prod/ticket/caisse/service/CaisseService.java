package com.dev2prod.ticket.caisse.service;

import com.dev2prod.ticket.caisse.entity.CaisseEntity;
import com.dev2prod.ticket.caisse.repository.CaisseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaisseService {

    @Autowired
    private CaisseRepository caisseRepository;

    public void saveCaisse(CaisseEntity caisseObj) {
        caisseRepository.save(caisseObj);
    }

    public CaisseEntity getCaisseDetailsById(Long caisseId) {
        if (null != caisseId) {
            return caisseRepository.findById(caisseId).orElse(null);
        } 
        return null; // ou vous pouvez lever une exception si l'ID n'existe pas.
    }

    public List<CaisseEntity> getAllCaisseDetails() {
        return caisseRepository.findAll();
    }

    public void deleteCaisse(Long caisseId) {
        caisseRepository.deleteById(caisseId);
    }
    
    public boolean updateCaisse(Long caisseId, CaisseEntity caisseObj) {
        if (caisseRepository.existsById(caisseId)) {
            caisseObj.setCaisseId(caisseId); // Assurez-vous que l'ID est bien défini avant de sauvegarder
            caisseRepository.save(caisseObj);
            return true;
        } else {
            return false;
        }
    }

}
