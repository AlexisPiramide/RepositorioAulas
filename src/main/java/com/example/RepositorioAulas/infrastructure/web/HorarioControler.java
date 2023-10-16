package com.example.RepositorioAulas.infrastructure.web;

import com.example.RepositorioAulas.application.SesionUseCase;
import com.example.RepositorioAulas.domain.Sesion;
import com.example.RepositorioAulas.infrastructure.db.SesionRepositorySQL;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import java.util.List;

@Controller
public class HorarioControler {

    SesionUseCase sesionUseCase;

    public HorarioControler() {
        sesionUseCase = new SesionUseCase(new SesionRepositorySQL());
    }

    @PostMapping("/horario")
    public String horario(Model model, @RequestParam("Aula") String id_aula) {


        HashMap<Integer, Sesion[]> sesiones = sesionUseCase.getHasmap(id_aula);
        List<Sesion[]> sesionesTemplate = new ArrayList<>();
        for (int i = 1; i <= sesiones.keySet().size(); i++) {
            sesionesTemplate.add(sesiones.get(i));
        }
        model.addAttribute("sesiones", sesionesTemplate);

        return "horario";
    }




}