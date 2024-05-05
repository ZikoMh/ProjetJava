package com.example.projetjava;

import com.example.projetjava.dao.entities.*;
import com.example.projetjava.service.Filiere.FiliereManager;
import com.example.projetjava.service.Matiere.MatiereManager;
import com.example.projetjava.service.Utilisateur.UtilisateurManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class ProjetJavaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProjetJavaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {



    }
}
