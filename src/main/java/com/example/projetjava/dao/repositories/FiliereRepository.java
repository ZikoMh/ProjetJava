package com.example.projetjava.dao.repositories;

import com.example.projetjava.dao.entities.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FiliereRepository extends JpaRepository<Filiere,Integer> {
    Filiere findFiliereByNom(String nom);
}
