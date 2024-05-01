package com.example.projetjava.web;

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

    @GetMapping("/lists")
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
    @GetMapping("/ajouterUser")
    public String addUser(){
        return "ajouterUser";
    }
    @PostMapping("/ajouterUser")
    public ResponseEntity<Utilisateur> addUser(Model model , @RequestBody Utilisateur utilisateur){
        Utilisateur user = uManager.addUtilisateur(utilisateur);
        return ResponseEntity.ok().body(utilisateur);

    }
    @PostMapping("/deleteUtilisateur/{id}")
    public boolean deleteUtilisateur(@PathVariable("id")int id){
        boolean userDeleted = uManager.deleteUtilisateur(id);
            return userDeleted;
    }


}
