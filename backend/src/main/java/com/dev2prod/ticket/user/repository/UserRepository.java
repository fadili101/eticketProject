package com.dev2prod.ticket.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev2prod.ticket.user.entity.UserEntity;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    List<UserEntity> findAllByUserId(Long userId);
    List<UserEntity> findByNomUserContainingOrPrenomUserContaining(String nomUser, String prenomUser);
}
