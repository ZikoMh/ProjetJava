package com.example.projetjava.dao.repositories;

import com.example.projetjava.dao.entities.Matiere;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
@Transactional
public interface MatiereRepository extends JpaRepository<Matiere,Integer> {
    public Matiere findMatiereByNom(String name);

}
