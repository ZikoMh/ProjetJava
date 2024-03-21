package com.example.projetjava.service;

import com.example.projetjava.dao.entities.Utilisateur;

import java.util.List;

public interface UtilisateurManager {
    public Utilisateur addUtilisateur(Utilisateur utilisateur);
    public List<Utilisateur> allUtilisateurs();
    public Utilisateur findUtilisateur(int id);
    public Utilisateur findUtilisateurNom(String nom);
    public boolean deleteUtilisateur(int id);
    public Utilisateur updateUtilisateur(int id , Utilisateur utilisateur);
}
