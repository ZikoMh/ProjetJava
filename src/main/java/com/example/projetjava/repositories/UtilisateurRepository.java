package com.example.projetjava.repositories;

import com.example.projetjava.entities.Utilisateur;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
@Transactional
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {
}
