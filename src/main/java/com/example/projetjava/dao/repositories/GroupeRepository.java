package com.example.projetjava.dao.repositories;

import com.example.projetjava.dao.entities.Groupe;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
@Transactional
public interface GroupeRepository extends JpaRepository<Groupe,Integer> {
}
