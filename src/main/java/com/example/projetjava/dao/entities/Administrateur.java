package com.example.projetjava.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Administrateur")
@Data


public class Administrateur extends Utilisateur{
}
