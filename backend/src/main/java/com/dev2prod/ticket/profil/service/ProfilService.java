package com.dev2prod.ticket.profil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.ticket.caisse.entity.CaisseEntity;
import com.dev2prod.ticket.profil.entity.ProfilEntity;
import com.dev2prod.ticket.profil.repository.ProfilRepository;
import com.dev2prod.ticket.user.entity.UserEntity;
import com.dev2prod.ticket.workflow.entity.WorkflowEntity;
import com.dev2prod.ticket.workflow.repository.WorkflowRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ProfilService {

    @Autowired
    private ProfilRepository profilRepository;
    @Autowired
    private WorkflowRepository workflowRepository;
    
    public ProfilEntity getProfilById(Long profilId) {
        Optional<ProfilEntity> profilOpt = profilRepository.findById(profilId);
        return profilOpt.orElse(null);
    }

    public List<ProfilEntity> getAllProfils() {
        return profilRepository.findAll();
    }

    public ProfilEntity saveProfil(ProfilEntity profilObj) {
        return profilRepository.save(profilObj);
    }

    public void deleteProfil(Long profilId) {
        profilRepository.deleteById(profilId);
    }
    public boolean updateProfil(Long profilId, ProfilEntity profilObj) {
        if (profilRepository.existsById(profilId)) {
            profilObj.setProfilId(profilId); // Assurez-vous que l'ID est bien défini avant de sauvegarder
            profilRepository.save(profilObj);
            return true;
        } else {
            return false;
        }
    }
    public ProfilEntity assignWorkflowToProfil(Long profilId, Long workflowId) {
        Set<WorkflowEntity> workflowSet = null;
        ProfilEntity profil = profilRepository.findById(profilId).get();
        WorkflowEntity workflow = workflowRepository.findById(workflowId).get();
        workflowSet =  profil.getAssignedWorkflows();
        workflowSet.add(workflow);
        profil.setAssignedWorkflows(workflowSet);
        return profilRepository.save(profil);
    }
}
