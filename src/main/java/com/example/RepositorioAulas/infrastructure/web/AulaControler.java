package com.example.RepositorioAulas.infrastructure.web;

import com.example.RepositorioAulas.BD.AulaDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
public class AulaControler {

    public List<String> temporalprofesores() {
        List<String> Aulas = new ArrayList<>(); //= AulaDAO.obtenerAulas();

        for (int i = 1; i <= 50; i++) {
            String idAula = "A" + (i % 14 + 1);
            String dia = "Día" + i;
            String profesor = "Profesor" + i;
            String materia = "Materia" + i;
            Integer nSesion = i;
            Integer horaInicio = 8 + i;
            Integer horaFin = 10 + i;

         //   Aula aula = new Aula(idAula, dia, profesor, materia, nSesion, horaInicio, horaFin);
          //  Aulas.add(aula.getIdAula());
        }

        return Aulas;
    }

    @PostMapping()
    public String formulario() {
        return "horario";
    }

    /**Asegurarse de que AulaDOA.obtenerAulas() tiene la consulta bien */
    @GetMapping("/form")
    public String formulario(Model model){
        List <String> Aulas = temporalprofesores();
        //List<String> Aulas = AulaDAO.obtenerAulas();
        model.addAttribute("Aulas", Aulas);
        return "form";
    }

    @GetMapping("/horario")
    public String mostrarHorario(){
        return "horario";
    }

}
