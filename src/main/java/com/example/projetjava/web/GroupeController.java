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

}
