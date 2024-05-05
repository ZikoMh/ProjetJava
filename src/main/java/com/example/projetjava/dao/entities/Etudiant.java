package com.example.projetjava.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Table(name = "Etudiant")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant extends Utilisateur {
    String specialite;
    String niveau;
    @ManyToOne()
    private Filiere filiere;

}
