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
        model.addAttribute("listaLunes",filtrahorariosLunes(id_aula));
        model.addAttribute("listaMartes",filtrahorariosMartes(id_aula));
        model.addAttribute("listaMiercoles",filtrahorariosMiercoles(id_aula));
        model.addAttribute("listaJueves",filtrahorariosJueves(id_aula));
        model.addAttribute("listaViernes",filtrahorariosViernes(id_aula));


        return "horario";
    }


    public List<Sesion> filtrahorariosLunes(String id) {

        List<Sesion> listaLunes = sesionUseCase.getAll(id,1);

        return listaLunes;
    }

    public List<Sesion> filtrahorariosMartes(String id) {

        List<Sesion> listaMartes = sesionUseCase.getAll(id,2);

        return listaMartes;
    }

    public List<Sesion> filtrahorariosMiercoles(String id) {

        List<Sesion> listaMiercoles = sesionUseCase.getAll(id,3);

        return listaMiercoles;
    }
    public List<Sesion> filtrahorariosJueves(String id) {

        List<Sesion> listaJueves = sesionUseCase.getAll(id,4);

        return listaJueves;
    }

    public List<Sesion> filtrahorariosViernes(String id) {

        List<Sesion> listaViernes = sesionUseCase.getAll(id,5);

        return listaViernes;
    }





}