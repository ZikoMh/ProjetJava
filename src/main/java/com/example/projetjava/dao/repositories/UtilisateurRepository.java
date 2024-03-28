package com.example.projetjava.dao.repositories;

import com.example.projetjava.dao.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {
    public Utilisateur findByNom(String nom);
}
