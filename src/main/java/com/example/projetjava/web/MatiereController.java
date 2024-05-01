package com.example.projetjava.web;

import com.example.projetjava.dao.entities.Matiere;
import com.example.projetjava.service.Matiere.MatiereManager;
import com.example.projetjava.service.Matiere.MatiereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MatiereController {
    @Autowired
    MatiereManager maManager;
    @GetMapping("/ListMatieres")
    public List<Matiere> listMatiere(){
        return maManager.allMatieres();
    }
    @PostMapping("/addMatiere")
    public ResponseEntity<Matiere> addMatiere(@RequestBody Matiere matiere) {
        Matiere addedMatiere = maManager.addMatiere(matiere);
        return new ResponseEntity<>(addedMatiere, HttpStatus.CREATED);
    }
    @GetMapping("/getMatire/{name}")
    public ResponseEntity<Matiere> getMatiereByName(@PathVariable("name") String name){
        Matiere m = maManager.MatierebyName(name);
        if(m==null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(m, HttpStatus.OK);
    }
    @DeleteMapping("/deleteMatier/{id}")
    public String deleteMatiereById(@PathVariable("id") int id){
        boolean matiereDeleted = maManager.deleteMatiere(id);
        if(!matiereDeleted)
            return "matiere non supp";
        return "matiere sup";

    }
}
