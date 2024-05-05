package com.example.projetjava.service.Filiere;

import com.example.projetjava.dao.entities.Filiere;
import com.example.projetjava.dao.repositories.FiliereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class FiliereService implements FiliereManager{
    @Autowired
    FiliereRepository filiereRepository;
    @Override
    public Filiere addFiliere(Filiere filiere) {
       List<Filiere> filieres = filiereRepository.findAll();
       for(Filiere f : filieres){
           if(!f.getNom().equals(filiere.getNom())){
               return filiereRepository.save(filiere);
           }
       }
       return filiere;
    }
    @Override
    public Filiere findFiliereById(int id) {
        return filiereRepository.findById(id).get();
    }

    @Override
    public boolean deleteFiliere(int id) {
        Filiere filiere = filiereRepository.findById(id).get();
        filiereRepository.delete(filiere);
        return true;
    }

    @Override
    public List<Filiere> allFilieres() {
        return filiereRepository.findAll();
    }

    @Override
    public Filiere findFiliereByName(String name) {
        return filiereRepository.findFiliereByNom(name);
    }
}
