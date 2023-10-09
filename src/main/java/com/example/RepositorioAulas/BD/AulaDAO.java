package com.example.RepositorioAulas.BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AulaDAO {
    private static Connection conexion;


    public AulaDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public static List<String> obtenerAulas() {

        String id = "id";
        String query = "SELECT " + id + " FROM aulas";
        List<String> aulas = new ArrayList<>();

        try (PreparedStatement statement = conexion.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String aula = resultSet.getString(id);
                aulas.add(aula);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return aulas;
    }
}

