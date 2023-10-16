package com.example.RepositorioAulas.application;

import com.example.RepositorioAulas.domain.Sesion;
import com.example.RepositorioAulas.domain.SesionRepository;
import com.example.RepositorioAulas.infrastructure.dao.DAOFactory;


import java.security.interfaces.DSAKey;
import java.util.HashMap;
import java.util.List;

public class SesionUseCase {

    SesionRepository sesionRepository;

    public SesionUseCase(SesionRepository sesionRepository){
        this.sesionRepository = sesionRepository;

    }

    public List<Object> getAllAulas(){
        return DAOFactory.getInstance().getSesionRepository().getAllAulas();
    }
    public List<Sesion> getAll(String id_aula){

        return DAOFactory.getInstance().getSesionRepository().getALl(id_aula);
    }

    public HashMap<Integer,Sesion[]> getHasmap(String aula){
        HashMap<Integer, Sesion[]> sesionesHorario = new HashMap<>();
        List<Sesion> sesiones = this.sesionRepository.getALl(aula);
        int franjasHorario = 13, dias = 5;
        for (int i = 1; i <= franjasHorario; i++) {
            sesionesHorario.put(i,new Sesion[dias]);
            for (int j = 0; j < dias; j++) {
                sesionesHorario.get(i)[j] = new Sesion();
            }
        }
        for(Sesion sesion: sesiones){
            int index = -1;
            if(sesion.getDia().equals("Lunes")) index = 0;
            else if(sesion.getDia().equals("Martes")) index = 1;
            else if(sesion.getDia().equals("Miercoles")) index = 2;
            else if(sesion.getDia().equals("Jueves")) index = 3;
            else if(sesion.getDia().equals("Viernes")) index = 4;
            sesionesHorario.get(sesion.getId_sesion())[index] = sesion;
            sesionesHorario.get(sesion.getId_sesion())[0].setHora_inicio(sesion.getHora_inicio());
            sesionesHorario.get(sesion.getId_sesion())[0].setHora_fin(sesion.getHora_fin());
        }
        return sesionesHorario;
    }



}
