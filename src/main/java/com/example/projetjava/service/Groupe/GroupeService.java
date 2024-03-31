package com.example.projetjava.service.Groupe;

import com.example.projetjava.dao.entities.Groupe;
import com.example.projetjava.dao.repositories.GroupeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupeService implements GroupeManager{
    @Autowired
    private GroupeRepository groupeRepository;

    @Override
    public Groupe addGroupe(Groupe groupe) {
        int c=0;
        List<Groupe> groupeList = groupeRepository.findAll();
        for(Groupe p :  groupeList)
        {
            if(p.getLibelle().equals(groupe.getLibelle())) c++;
        }
        if(c==0)
          return groupeRepository.save(groupe);
        else
            return null;
    }

    @Override
    public boolean deleteGroupeByLibelle(String name) {
         groupeRepository.deleteByLibelle(name);
         return true;
    }

    @Override
    public Groupe findGroupe(String name) {
        return groupeRepository.findByLibelle(name);
    }
}
