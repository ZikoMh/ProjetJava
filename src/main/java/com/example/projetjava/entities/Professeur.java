package com.example.projetjava.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Professeur")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Professeur extends Utilisateur{
    String specialite;
}
