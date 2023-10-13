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
    public List<Sesion> getALl(String id_aula, Integer dia) {
        try {
            Connection connectionBD = ConectionManager.getConexion("horarioAulas" );
            PreparedStatement stmnt = null;
                    switch (dia){
                        case 1:
                            stmnt = connectionBD.prepareStatement("SELECT s.dia, s.id_sesion, s.hora_inicio, s.hora_fin, r.id_aula, a.id_asignatura " +
                                    "FROM sesion s " +
                                    "JOIN relacion r on s.id_sesion = r.id_sesion " +
                                    "JOIN asignatura a on a.id_asignatura = r.id_asignatura " +
                                    "where r.id_aula= '"+id_aula+"' && s.dia='Lunes'" +
                                    "order by id_sesion asc;");
                            break;

                        case 2:
                            stmnt = connectionBD.prepareStatement("SELECT s.dia, s.id_sesion, s.hora_inicio, s.hora_fin, r.id_aula, a.id_asignatura " +
                                    "FROM sesion s " +
                                    "JOIN relacion r on s.id_sesion = r.id_sesion " +
                                    "JOIN asignatura a on a.id_asignatura = r.id_asignatura " +
                                    "where r.id_aula= '"+id_aula+"' && s.dia='Martes'" +
                                    "order by id_sesion asc;");
                            break;
                        case 3:
                            stmnt = connectionBD.prepareStatement("SELECT s.dia, s.id_sesion, s.hora_inicio, s.hora_fin, r.id_aula, a.id_asignatura " +
                                    "FROM sesion s " +
                                    "JOIN relacion r on s.id_sesion = r.id_sesion " +
                                    "JOIN asignatura a on a.id_asignatura = r.id_asignatura " +
                                    "where r.id_aula= '"+id_aula+"' && s.dia='Miercoles'" +
                                    "order by id_sesion asc;");
                            break;
                        case 4:
                            stmnt = connectionBD.prepareStatement("SELECT s.dia, s.id_sesion, s.hora_inicio, s.hora_fin, r.id_aula, a.id_asignatura " +
                                    "FROM sesion s " +
                                    "JOIN relacion r on s.id_sesion = r.id_sesion " +
                                    "JOIN asignatura a on a.id_asignatura = r.id_asignatura " +
                                    "where r.id_aula= '"+id_aula+"' && s.dia='Jueves'" +
                                    "order by id_sesion asc;");
                            break;
                        case 5:
                            stmnt = connectionBD.prepareStatement("SELECT s.dia, s.id_sesion, s.hora_inicio, s.hora_fin, r.id_aula, a.id_asignatura " +
                                    "FROM sesion s " +
                                    "JOIN relacion r on s.id_sesion = r.id_sesion " +
                                    "JOIN asignatura a on a.id_asignatura = r.id_asignatura " +
                                    "where r.id_aula= '"+id_aula+"' && s.dia='Viernes'" +
                                    "order by id_sesion asc;");
                            break;

                    }


            ResultSet rs = stmnt.executeQuery();


            List<Sesion> listaAulas = new ArrayList<>();

            while (rs.next()){

                listaAulas.add(new Sesion(rs.getString("dia"),rs.getInt("id_sesion"),rs.getString("hora_inicio"),rs.getString("hora_fin"),rs.getString("id_aula"),rs.getString("id_asignatura")));
            }

            return listaAulas;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
