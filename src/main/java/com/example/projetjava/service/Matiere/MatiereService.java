package com.example.projetjava.service.Matiere;

import com.example.projetjava.dao.entities.Matiere;
import com.example.projetjava.dao.repositories.MatiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatiereService implements MatiereManager{
    @Autowired
    MatiereRepository mRepo;
    @Override
    public Matiere addMatiere(Matiere matiere) {
        List<Matiere> matieresBd = mRepo.findAll();
        int c=0;
        for(Matiere m : matieresBd){
            if(m.equals(matiere)){
               c++;
            }
        }
        if(c==0) mRepo.save(matiere);
        return matiere;
    }

    @Override
    public List<Matiere> allMatieres() {
        return mRepo.findAll();
    }

    @Override
    public Matiere MatierebyName(String name) {
        return mRepo.findMatiereByNom(name);
    }

    @Override
    public boolean deleteMatiere(int id) {
        mRepo.deleteById(id);
        return true;
    }
}
