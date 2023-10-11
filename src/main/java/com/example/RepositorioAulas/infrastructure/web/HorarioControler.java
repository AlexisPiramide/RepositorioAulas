package com.example.RepositorioAulas.infrastructure.web;

import com.example.RepositorioAulas.domain.Sesion;

import java.util.ArrayList;
import java.util.List;

public class HorarioControler {
    public void filtrahorarios(List<Sesion> lista) {
        List<Sesion> ListaLunes = new ArrayList<>();
        List<Sesion> ListaMartes = new ArrayList<>();
        List<Sesion> ListaMiercoles = new ArrayList<>();
        List<Sesion> ListaJueves = new ArrayList<>();
        List<Sesion> ListaViernes = new ArrayList<>();

        for (Sesion Sesion : lista) {
            switch (Sesion.getDia()) {
                case "Lunes":
                    switch (Sesion.getId_sesion()) {
                        case 1:
                            ListaLunes.add(0, Sesion);
                            break;
                        case 2:
                            ListaLunes.add(1, Sesion);
                            break;
                        case 3:
                            ListaLunes.add(2, Sesion);
                            break;
                        case 4:
                            ListaLunes.add(3, Sesion);
                            break;
                        case 5:
                            ListaLunes.add(4, Sesion);
                            break;
                        case 6:
                            ListaLunes.add(5, Sesion);
                            break;
                    }
                    break;
                case "Martes":
                    switch (Sesion.getId_sesion()) {
                        case 1:
                            ListaMartes.add(0, Sesion);
                            break;
                        case 2:
                            ListaMartes.add(1, Sesion);
                            break;
                        case 3:
                            ListaMartes.add(2, Sesion);
                            break;
                        case 4:
                            ListaMartes.add(3, Sesion);
                            break;
                        case 5:
                            ListaMartes.add(4, Sesion);
                            break;
                        case 6:
                            ListaMartes.add(5, Sesion);
                            break;
                    }
                    break;
                case "Miercoles":
                    switch (Sesion.getId_sesion()) {
                        case 1:
                            ListaMiercoles.add(0, Sesion);
                            break;
                        case 2:
                            ListaMiercoles.add(1, Sesion);
                            break;
                        case 3:
                            ListaMiercoles.add(2, Sesion);
                            break;
                        case 4:
                            ListaMiercoles.add(3, Sesion);
                            break;
                        case 5:
                            ListaMiercoles.add(4, Sesion);
                            break;
                        case 6:
                            ListaMiercoles.add(5, Sesion);
                            break;
                    }
                    break;
                case "Jueves":
                    switch (Sesion.getId_sesion()) {
                        case 1:
                            ListaJueves.add(0, Sesion);
                            break;
                        case 2:
                            ListaJueves.add(1, Sesion);
                            break;
                        case 3:
                            ListaJueves.add(2, Sesion);
                            break;
                        case 4:
                            ListaJueves.add(3, Sesion);
                            break;
                        case 5:
                            ListaJueves.add(4, Sesion);
                            break;
                        case 6:
                            ListaJueves.add(5, Sesion);
                            break;
                    }
                    break;
                case "Viernes":
                    switch (Sesion.getId_sesion()) {
                        case 1:
                            ListaViernes.add(0, Sesion);
                            break;
                        case 2:
                            ListaViernes.add(1, Sesion);
                            break;
                        case 3:
                            ListaViernes.add(2, Sesion);
                            break;
                        case 4:
                            ListaViernes.add(3, Sesion);
                            break;
                        case 5:
                            ListaViernes.add(4, Sesion);
                            break;
                        case 6:
                            ListaViernes.add(5, Sesion);
                            break;
                    }
                    break;
            }
        }
    }


}