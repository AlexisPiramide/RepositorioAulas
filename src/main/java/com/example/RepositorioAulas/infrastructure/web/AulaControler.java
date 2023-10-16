package com.example.RepositorioAulas.infrastructure.web;


import com.example.RepositorioAulas.application.SesionUseCase;
import com.example.RepositorioAulas.infrastructure.db.SesionRepositorySQL;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AulaControler {

    SesionUseCase sesionUseCase;

    public AulaControler() {
        sesionUseCase = new SesionUseCase( new SesionRepositorySQL());
    }

    @GetMapping("/")
    public String formulario(Model model){
        List<Object> Aulas = sesionUseCase.getAllAulas();

        model.addAttribute("Aulas", Aulas);
        return "form";
    }


}
