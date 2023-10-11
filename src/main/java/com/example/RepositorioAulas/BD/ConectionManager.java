package com.example.RepositorioAulas.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionManager {

    private static Connection con;
    private static ConectionManager conexionBD;

    private ConectionManager(String bd){

        try {
            con = DriverManager.getConnection("jdbc:mysql://db-servidor-1.cwmhsnh2pctj.us-east-1.rds.amazonaws.com:3306/" + bd ,"admin","18072110k");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConexion(String bd){

        if(conexionBD == null)
            conexionBD = new ConectionManager(bd);
        return con;
    }

    public static void closeConexion(){

        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}