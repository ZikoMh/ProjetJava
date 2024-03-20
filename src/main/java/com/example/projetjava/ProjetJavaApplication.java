package com.example.projetjava;

import com.example.projetjava.entities.Administrateur;
import com.example.projetjava.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetJavaApplication implements CommandLineRunner {
    @Autowired
    UtilisateurRepository  utilisateurRepository;
    public static void main(String[] args) {
        SpringApplication.run(ProjetJavaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
