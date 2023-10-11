package com.example.RepositorioAulas.infrastructure.web;

import com.example.RepositorioAulas.BD.AulaDAO;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class AulaControler {

    @PostMapping("/buscar")
    public String buscar(Model model) {
        List<String> Aulas;
        Aulas = AulaDAO.obtenerAulas();

        model.addAttribute("Aulas", Aulas);
        return "buscar";
    }

    @GetMapping("/encontrado")
    public String encontrado(){

        return "encontrado";
    }

}
