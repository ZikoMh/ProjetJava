package com.example.projetjava.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;

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
    @ManyToMany()
    Collection<Etudiant> etudiants;
    @ManyToMany()
    Collection<Professeur> professeurs;
}
