package com.example.projetjava.service.Groupe;

import com.example.projetjava.dao.entities.Groupe;

public interface GroupeManager {
    public Groupe addGroupe(Groupe groupe);
    public boolean deleteGroupeByLibelle(String name);
    public Groupe findGroupe(String name);


}
