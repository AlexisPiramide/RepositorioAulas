package com.example.RepositorioAulas.infrastructure.dao;

import com.example.RepositorioAulas.infrastructure.db.SesionRepositorySQL;

public class DAOSesionSql {

    private SesionRepositorySQL sesionRepositorySQL;

    public DAOSesionSql(){
        sesionRepositorySQL = new SesionRepositorySQL();
    }

    public SesionRepositorySQL getSesionRepositorySQL(){
        return sesionRepositorySQL;
    }

}
