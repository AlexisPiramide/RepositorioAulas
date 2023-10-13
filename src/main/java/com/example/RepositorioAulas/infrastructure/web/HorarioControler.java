package com.example.RepositorioAulas.infrastructure.web;

import com.example.RepositorioAulas.application.SesionUseCase;
import com.example.RepositorioAulas.domain.Sesion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HorarioControler {

    SesionUseCase sesionUseCase;

    public HorarioControler() {
        sesionUseCase = new SesionUseCase();
    }

    @PostMapping("/horario")
    public String horario(Model model, @RequestParam("Aula") String id_aula) {
        System.out.println(id_aula);
        model.addAttribute("ListaLunes",filtrahorariosLunes(id_aula));


        return "horario";
    }


    public List<Sesion> filtrahorariosLunes(String id) {

        List<Sesion> listaLunes = sesionUseCase.getAll(id,1);

        return listaLunes;
    }




}