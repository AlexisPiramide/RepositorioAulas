package com.example.RepositorioAulas.BD;

import com.example.RepositorioAulas.Aula;

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

        String id = "id_aula";
        String query = "SELECT " + id + " FROM relacion;";
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

    public static List<Aula> obtenerhorario() {


        String IDAula = "";
        ;
        String query = "SELECT * FROM aulas where idclase='"+IDAula+"';";


        List<Aula> aulas = new ArrayList<>();

        try (PreparedStatement statement = conexion.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Integer sesion = resultSet.getInt("sesion");
                String dia = resultSet.getString("dia");
                Integer horainicio = resultSet.getInt("horainicio");
                Integer horafin = resultSet.getInt("horafin");
                String profesor = resultSet.getString("profesor");
                String materia = resultSet.getString("materia");

                Aula aula = new Aula(IDAula,dia,profesor,materia,sesion,horainicio,horafin);
                aulas.add(aula);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return aulas;
    }
}

