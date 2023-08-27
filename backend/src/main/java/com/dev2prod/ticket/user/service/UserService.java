package com.dev2prod.ticket.user.service;

import com.dev2prod.ticket.caisse.entity.CaisseEntity;
import com.dev2prod.ticket.caisse.repository.CaisseRepository;
import com.dev2prod.ticket.departement.entity.DepartementEntity;
import com.dev2prod.ticket.user.entity.UserEntity;
import com.dev2prod.ticket.user.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CaisseRepository caisseRepository;

    public UserEntity saveUser(UserEntity userObj) {
        return userRepository.save(userObj);
        
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity getUserDetailsById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }


    
    public UserEntity assignCaisseToUser(Long userId, Long caisseId) {
        Set<CaisseEntity> caisseSet = null;
        UserEntity user = userRepository.findById(userId).get();
        CaisseEntity caisse = caisseRepository.findById(caisseId).get();
        caisseSet =  user.getAssignedCaisses();
        caisseSet.add(caisse);
        user.setAssignedCaisses(caisseSet);
        return userRepository.save(user);
    }
    
    public boolean updateUser(Long userId, UserEntity depObj) {
        if (userRepository.existsById(userId)) {
            depObj.setUserId(userId); // Assurez-vous que l'ID est bien défini avant de sauvegarder
            userRepository.save(depObj);
            return true;
        } else {
            return false;
        }
    }
    
    public List<UserEntity> findUsersByNameOrSurname(String searchText) {
        return userRepository.findByNomUserContainingOrPrenomUserContaining(searchText, searchText);
    }

}
