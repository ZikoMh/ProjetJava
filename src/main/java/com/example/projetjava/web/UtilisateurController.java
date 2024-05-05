package com.example.projetjava.web;

import com.example.projetjava.dao.entities.Administrateur;
import com.example.projetjava.dao.entities.Etudiant;
import com.example.projetjava.dao.entities.Utilisateur;
import com.example.projetjava.service.Utilisateur.UtilisateurManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UtilisateurController {
    @Autowired
    UtilisateurManager uManager;

    @GetMapping("/users")
    public String listuser(Model model){
        List<Utilisateur> users = uManager.allUtilisateurs();

        model.addAttribute("users",users);
        return "listuser";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/index")
    public String page (){
        return "index";
    }
    @GetMapping("/users/ajouterEtudiant")
    public String addEtudiant(Model model){
        Etudiant etudiant = new Etudiant();
        model.addAttribute("etudiant",etudiant);
        return "ajouterEtudiant";
    }
    @PostMapping("/users/ajouterEtudiant")
    public String saveEtudiant(@ModelAttribute("etudiant") Etudiant etudiant){
        uManager.addUtilisateur(etudiant);
        return "redirect:/users";
    }
    @GetMapping("/users/ajouterProfesseur")
    public String addProfesseur(Model model){
        return "ajouterProfesseur";
    }
    @GetMapping("/users/ajouterAdministrateur")
    public String addAdministrateur(Model model){
        Utilisateur user = new Administrateur();
        model.addAttribute("administrateur",user);
        return "ajouterAdministrateur";
    }
    @PostMapping("/users/ajouterAdministrateur")
    public String saveAdministrateur(@ModelAttribute("administrateur")Administrateur administrateur){
        uManager.addUtilisateur(administrateur);
        return "redirect:/users";
    }
    @GetMapping("/supprimeruser/{id}")
    public String supprimerrUser(Model model,@PathVariable("id") Integer id){
        if(uManager.deleteUtilisateur(id)) return "redirect:/lists";
        else return "erreur";
    }



}
