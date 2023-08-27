package com.dev2prod.ticket.departement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.departement.entity.DepartementEntity;
import com.dev2prod.ticket.departement.repository.DepartementRepository;
import com.dev2prod.ticket.profil.entity.ProfilEntity;

@Service
public class DepartementService {

    @Autowired
    private DepartementRepository departementRepository;

    public List<DepartementEntity> getAllDepartements() {
        return departementRepository.findAll();
    }

    public DepartementEntity getDepartementById(Long id) {
        return departementRepository.findById(id).orElse(null);
    }

    public DepartementEntity saveDepartement(DepartementEntity departement) {
        return departementRepository.save(departement);
    }

    public void deleteDepartement(Long id) {
        departementRepository.deleteById(id);
    }
    
    public boolean updateDepartement(Long depId, DepartementEntity depObj) {
        if (departementRepository.existsById(depId)) {
            depObj.setDepartementId(depId); // Assurez-vous que l'ID est bien défini avant de sauvegarder
            departementRepository.save(depObj);
            return true;
        } else {
            return false;
        }
    }

    // Ajoutez d'autres méthodes de service si nécessaire.
}
