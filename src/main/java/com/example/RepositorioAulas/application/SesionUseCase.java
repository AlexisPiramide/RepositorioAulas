package com.example.RepositorioAulas.application;

import com.example.RepositorioAulas.domain.Sesion;
import com.example.RepositorioAulas.infrastructure.dao.DAOFactory;


import java.security.interfaces.DSAKey;
import java.util.List;

public class SesionUseCase {


    public List<Sesion> getAllAulas(){
        return DAOFactory.getInstance().getSesionRepository().getAllAulas();
    }
    public List<Sesion> getAll(){

        return DAOFactory.getInstance().getSesionRepository().getALl();
    }



}
