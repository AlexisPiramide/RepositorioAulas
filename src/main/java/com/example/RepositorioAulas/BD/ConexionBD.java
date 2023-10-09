package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private final String baseDatos= "";
    private final String url = "jdbc:mysql://(La Base de datos)/"+baseDatos;
    private final String usuario = "";
    private final String contraseña = "";

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