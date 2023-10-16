package com.example.RepositorioAulas.infrastructure.db;

import com.example.RepositorioAulas.connection.ConectionManager;
import com.example.RepositorioAulas.domain.Sesion;
import com.example.RepositorioAulas.domain.SesionRepository;
import org.springframework.stereotype.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Controller
public class SesionRepositorySQL implements SesionRepository {
    @Override
    public List<Object> getAllAulas() {

        try {
            Connection connectionBD = ConectionManager.getConexion("horarioAulas" );
            PreparedStatement stmnt = connectionBD.prepareStatement("select distinct id_aula from relacion");

            ResultSet rs = stmnt.executeQuery();


            List<Object> listaAulas = new ArrayList<>();

            while (rs.next()){

               listaAulas.add(rs.getString(1));
            }

            return listaAulas;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Sesion> getALl(String id_aula) {
        try {
            Connection connectionBD = ConectionManager.getConexion("horarioAulas" );
            PreparedStatement stmnt = connectionBD.prepareStatement("SELECT DISTINCT r.dia, r.id_sesion, s.hora_inicio, s.hora_fin, r.id_aula, r.id_asignatura, a.nombre " +
                                "FROM sesion s " +
                                "JOIN relacion r on s.id_sesion = r.id_sesion " +
                                "JOIN asignatura a on a.id_asignatura = r.id_asignatura " +
                                "where r.id_aula = " + id_aula + " " +
                                "order by id_sesion asc;");


            ResultSet rs = stmnt.executeQuery();


            List<Sesion> sesiones = new ArrayList<>();

            while (rs.next()){

                sesiones.add(new Sesion(rs.getString("dia"),rs.getInt("id_sesion"),rs.getString("hora_inicio"),rs.getString("hora_fin"),rs.getString("id_aula"),rs.getString("nombre")));
            }

            return sesiones;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
