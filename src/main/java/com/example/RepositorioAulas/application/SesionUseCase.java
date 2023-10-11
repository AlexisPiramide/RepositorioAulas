package com.example.RepositorioAulas.application;

import com.example.RepositorioAulas.domain.Sesion;
import com.example.RepositorioAulas.infrastructure.dao.DAOFactory;


import java.security.interfaces.DSAKey;
import java.util.List;

public class SesionUseCase {


    public List<Object> getAllAulas(){
        return DAOFactory.getInstance().getSesionRepository().getAllAulas();
    }
    public List<Sesion> getAll(String id_aula){

        return DAOFactory.getInstance().getSesionRepository().getALl(id_aula);
    }



}
