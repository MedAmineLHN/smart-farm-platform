package com.pfa.smartfarmplatform.repositories;

import com.pfa.smartfarmplatform.entities.utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface utilisateurRepository extends JpaRepository<utilisateur, Long> {

    Optional<utilisateur> findByEmail(String email);

    boolean existsByEmail(String email);
}