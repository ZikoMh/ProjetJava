package com.example.projetjava;

import com.example.projetjava.dao.entities.Administrateur;
import com.example.projetjava.dao.entities.Matiere;
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
        Matiere m1 = new Matiere();
        Matiere m2 = new Matiere();

        m1.setNom("info");
        m1.setDescription("info est");
        m1.setEtudiants(null);
        m1.setProfesseurs(null);
        maManager.addMatiere(m1);
        m2.setNom("gestion");
        m2.setDescription("info est");
        m2.setEtudiants(null);
        m2.setProfesseurs(null);
        maManager.addMatiere(m2);
//        System.out.println(maManager.MatierebyName("gestio"));


    }
}
