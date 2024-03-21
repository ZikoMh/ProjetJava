package com.example.projetjava.service;

import com.example.projetjava.dao.entities.Utilisateur;
import com.example.projetjava.dao.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UtilisateurService implements UtilisateurManager {
    @Autowired
    UtilisateurRepository uRepo;
    @Override
    public Utilisateur addUtilisateur(Utilisateur utilisateur) {
        if(utilisateur.getAge()>0 && utilisateur.getAge()<100){
            utilisateur.setFlag("o");
            uRepo.save(utilisateur);
        }
        else
            return null;
        return utilisateur;
    }

    @Override
    public List<Utilisateur> allUtilisateurs() {
        List<Utilisateur> u = new ArrayList<Utilisateur>();
        for(Utilisateur user : uRepo.findAll()){
            if(user.getFlag().equals("o"))
                u.add(user);
        }
        return u;
    }

    @Override
    public Utilisateur findUtilisateur(int id) {
        if(uRepo.findById(id).get().getFlag().equals("o"))
            return uRepo.findById(id).get();
        else
            return null;
    }

    @Override
    public Utilisateur findUtilisateurNom(String nom) {
        if(uRepo.findByNom(nom).getFlag().equals("o"))
            return uRepo.findByNom(nom);
        else
            return null;
    }

    @Override
    public boolean deleteUtilisateur(int id) {
        Utilisateur user = uRepo.findById(id).get();
        user.setFlag("x");
        uRepo.save(user);
        return true;
    }

    @Override
    public Utilisateur updateUtilisateur(int id, Utilisateur utilisateur) {
       Utilisateur u= uRepo.findById(id).get();
        if(u.getFlag().equals("o")){
            u.setNom(utilisateur.getNom());
            u.setAge(utilisateur.getAge());
            u.setPrenom(utilisateur.getPrenom());
            u.setEmail(utilisateur.getEmail());
            u.setMotDePasse(utilisateur.getMotDePasse());

        }
        return u;
    }
}
