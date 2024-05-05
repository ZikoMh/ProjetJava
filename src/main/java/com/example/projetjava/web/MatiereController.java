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

}
