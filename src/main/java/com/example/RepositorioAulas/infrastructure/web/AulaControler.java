package com.example.RepositorioAulas.infrastructure.web;

import com.example.RepositorioAulas.Aula;
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


    public void filtrahorarios(List<Aula> lista) {
        List<Aula> ListaLunes = new ArrayList<>();
        List<Aula> ListaMartes = new ArrayList<>();
        List<Aula> ListaMiercoles = new ArrayList<>();
        List<Aula> ListaJueves = new ArrayList<>();
        List<Aula> ListaViernes = new ArrayList<>();

        for (Aula aula : lista) {
            switch (aula.getDia()) {
                case "Lunes":
                    switch (aula.getId_sesion()) {
                        case 1:
                            ListaLunes.add(0, aula);
                            break;
                        case 2:
                            ListaLunes.add(1, aula);
                            break;
                        case 3:
                            ListaLunes.add(2, aula);
                            break;
                        case 4:
                            ListaLunes.add(3, aula);
                            break;
                        case 5:
                            ListaLunes.add(4, aula);
                            break;
                        case 6:
                            ListaLunes.add(5, aula);
                            break;
                    }
                    break;
                case "Martes":
                    switch (aula.getId_sesion()) {
                        case 1:
                            ListaMartes.add(0, aula);
                            break;
                        case 2:
                            ListaMartes.add(1, aula);
                            break;
                        case 3:
                            ListaMartes.add(2, aula);
                            break;
                        case 4:
                            ListaMartes.add(3, aula);
                            break;
                        case 5:
                            ListaMartes.add(4, aula);
                            break;
                        case 6:
                            ListaMartes.add(5, aula);
                            break;
                    }
                    break;
                case "Miercoles":
                    switch (aula.getId_sesion()) {
                        case 1:
                            ListaMiercoles.add(0, aula);
                            break;
                        case 2:
                            ListaMiercoles.add(1, aula);
                            break;
                        case 3:
                            ListaMiercoles.add(2, aula);
                            break;
                        case 4:
                            ListaMiercoles.add(3, aula);
                            break;
                        case 5:
                            ListaMiercoles.add(4, aula);
                            break;
                        case 6:
                            ListaMiercoles.add(5, aula);
                            break;
                    }
                    break;
                case "Jueves":
                    switch (aula.getId_sesion()) {
                        case 1:
                            ListaJueves.add(0, aula);
                            break;
                        case 2:
                            ListaJueves.add(1, aula);
                            break;
                        case 3:
                            ListaJueves.add(2, aula);
                            break;
                        case 4:
                            ListaJueves.add(3, aula);
                            break;
                        case 5:
                            ListaJueves.add(4, aula);
                            break;
                        case 6:
                            ListaJueves.add(5, aula);
                            break;
                    }
                    break;
                case "Viernes":
                    switch (aula.getId_sesion()) {
                        case 1:
                            ListaViernes.add(0, aula);
                            break;
                        case 2:
                            ListaViernes.add(1, aula);
                            break;
                        case 3:
                            ListaViernes.add(2, aula);
                            break;
                        case 4:
                            ListaViernes.add(3, aula);
                            break;
                        case 5:
                            ListaViernes.add(4, aula);
                            break;
                        case 6:
                            ListaViernes.add(5, aula);
                            break;
                    }
                    break;
            }
        }
    }


}
