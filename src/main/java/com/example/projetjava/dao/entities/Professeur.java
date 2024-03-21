package com.example.projetjava.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Table(name = "Professeur")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Professeur extends Utilisateur{
    String specialite;
    @ManyToMany(mappedBy = "professeurs")
    Collection<Matiere> matieres;
}
