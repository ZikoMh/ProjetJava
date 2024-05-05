package com.example.projetjava.service.Filiere;

import com.example.projetjava.dao.entities.Filiere;

import java.util.List;

public interface FiliereManager {
    Filiere addFiliere(Filiere filiere);

    Filiere findFiliereById(int id);
    boolean deleteFiliere(int id);
    List<Filiere> allFilieres();
    Filiere findFiliereByName(String name);
}
