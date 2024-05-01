package com.example.projetjava.web;

import com.example.projetjava.dao.entities.Groupe;
import com.example.projetjava.service.Groupe.GroupeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
public class GroupeController {
    @Autowired
    private GroupeManager groupeManager;
    @GetMapping("/findGroupe/{groupe}")
    public Groupe findGroupeAction(@PathVariable("groupe") String groupe){
        return groupeManager.findGroupe(groupe);
    }
    @PostMapping("/addGroupe")
    public Groupe addGroupeAction(@RequestBody Groupe groupe){
        return groupeManager.addGroupe(groupe);
    }
    @PostMapping("/deleteGroupe/{name}")
    public String deleteGroupeAction(@PathVariable("name") String name){
         boolean matiereDel = groupeManager.deleteGroupeByLibelle(name);
         if(!matiereDel) return "matiere non supprime";
         else return "matiere supprime";
    }
}
