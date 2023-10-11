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
    public List<Sesion> getALl() {
        try {
            Connection connectionBD = ConectionManager.getConexion("horarioAulas" );
            PreparedStatement stmnt = connectionBD.prepareStatement("SELECT s.dia, s.id_sesion, s.hora_inicio, s.hora_fin, r.id_aula, a.id_asignatura\n" +
                    "FROM sesion s\n" +
                    "JOIN  relacion r  on s.id_sesion = r.id_sesion\n" +
                    "JOIN asignatura a on a.id_asignatura = r.id_asignatura;");

            ResultSet rs = stmnt.executeQuery();


            List<Sesion> listaAulas = new ArrayList<>();

            while (rs.next()){

                listaAulas.add(new Sesion(rs.getNString(1),rs.getInt(2),rs.getNString(3),rs.getNString(4),rs.getNString(5),rs.getNString(6)));
            }

            return listaAulas;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
