package com.example.projetjava.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idMatiere;
    String nom;
    String description;
    @ManyToMany(fetch = FetchType.EAGER)
    Collection<Etudiant> etudiants;
    @ManyToMany(fetch = FetchType.EAGER)
    Collection<Professeur> professeurs;
}
