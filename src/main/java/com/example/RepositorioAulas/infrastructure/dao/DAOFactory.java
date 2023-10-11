package com.example.RepositorioAulas.infrastructure.dao;

import com.example.RepositorioAulas.domain.SesionRepository;
import com.example.RepositorioAulas.infrastructure.db.SesionRepositorySQL;

public class DAOFactory {

    private static DAOFactory daoFactory;
    private SesionRepository sesionRepository;


    private DAOFactory(){}


    public static DAOFactory getInstance(){

        if (daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public SesionRepository getSesionRepository(){
        if (sesionRepository == null){
            sesionRepository = new SesionRepositorySQL();
        }

        return sesionRepository;
    }
}
