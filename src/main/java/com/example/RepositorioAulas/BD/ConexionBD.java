package com.example.RepositorioAulas.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private final String baseDatos= "horarioAulas";
    private final String url = "jdbc:mysql://db-servidor-1.cwmhsnh2pctj.us-east-1.rds.amazonaws.com:3306/"+baseDatos;
    private final String usuario = "admin";
    private final String contraseña = "18072110K";

    private static Connection con;
    private static ConexionBD conexionBD;

    private ConexionBD(String bd) {
        try {
            con = DriverManager.getConnection(url, usuario, contraseña);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static synchronized Connection getConexion(String bd) {
        if (conexionBD == null) {
            conexionBD = new ConexionBD(bd);
        }
        return con;
    }

    public static void closeConexion() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}