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
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_filiere;
    private String nom;
    @OneToMany(mappedBy = "filiere" ,fetch = FetchType.EAGER)
    private Collection<Etudiant> etudiants;
    @ManyToMany(mappedBy = "filieres",fetch = FetchType.EAGER)
    private Collection<Matiere>matieres;
    @OneToMany(mappedBy = "filiere",fetch = FetchType.EAGER)
    private Collection<Groupe>groupes;


}
