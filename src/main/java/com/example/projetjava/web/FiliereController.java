package com.example.projetjava.web;

import com.example.projetjava.service.Filiere.FiliereManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FiliereController {
    @Autowired
    FiliereManager filiereManager;
}
