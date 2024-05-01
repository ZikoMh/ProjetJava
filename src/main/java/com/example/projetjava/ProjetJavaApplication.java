package com.example.projetjava;

import com.example.projetjava.dao.entities.Administrateur;
import com.example.projetjava.dao.entities.Etudiant;
import com.example.projetjava.dao.entities.Matiere;
import com.example.projetjava.dao.entities.Utilisateur;
import com.example.projetjava.service.Matiere.MatiereManager;
import com.example.projetjava.service.Utilisateur.UtilisateurManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class ProjetJavaApplication implements CommandLineRunner {
    @Autowired
    UtilisateurManager uManager;
    @Autowired
    MatiereManager maManager;
    public static void main(String[] args) {
        SpringApplication.run(ProjetJavaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


    }
}
