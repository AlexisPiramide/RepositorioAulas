package com.example.RepositorioAulas.infrastructure.web;


import com.example.RepositorioAulas.application.SesionUseCase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AulaControler {

    SesionUseCase sesionUseCase;

    public AulaControler() {


        sesionUseCase = new SesionUseCase();
    }

    @PostMapping("/horario")
    public String horario() {
        return "horario";
    }

    /**Asegurarse de que AulaDOA.obtenerAulas() tiene la consulta bien */
    @GetMapping("/form")
    public String formulario(Model model){
        List<Object> Aulas = sesionUseCase.getAllAulas();

        model.addAttribute("Aulas", Aulas);
        return "form";
    }


}
