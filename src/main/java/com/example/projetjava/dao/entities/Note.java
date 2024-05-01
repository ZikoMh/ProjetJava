package com.example.projetjava.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNote;
    private double valeur;
    @ManyToOne()
    private Etudiant etudiants;
    @ManyToOne()
    private Matiere matieres;


}
