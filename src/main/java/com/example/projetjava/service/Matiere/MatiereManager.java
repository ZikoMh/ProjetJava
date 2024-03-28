package com.example.projetjava.service.Matiere;

import com.example.projetjava.dao.entities.Matiere;

import java.util.List;

public interface MatiereManager {
    public Matiere addMatiere(Matiere matiere);
    public List<Matiere> allMatieres();
    public Matiere MatierebyName(String name);
    public boolean deleteMatiere(int id);


}
