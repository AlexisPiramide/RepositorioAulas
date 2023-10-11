package com.example.RepositorioAulas.domain;

import java.sql.Time;

public class Sesion {

    private String dia;
    private Integer id_sesion;
    private String hora_inicio;
    private String hora_fin;
    private String id_aula;
    private String id_asignatura;

    public Sesion(String dia, Integer id_sesion, String hora_inicio, String hora_fin, String id_aula, String id_asignatura) {
        this.dia = dia;
        this.id_sesion = id_sesion;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.id_aula = id_aula;
        this.id_asignatura = id_asignatura;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Integer getId_sesion() {
        return id_sesion;
    }

    public void setId_sesion(Integer id_sesion) {
        this.id_sesion = id_sesion;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getId_aula() {
        return id_aula;
    }

    public void setId_aula(String id_aula) {
        this.id_aula = id_aula;
    }

    public String getId_asignatura() {
        return id_asignatura;
    }

    public void setId_asignatura(String id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    @Override
    public String toString() {
        return "Sesion{" +
                "dia='" + dia + '\'' +
                ", id_sesion=" + id_sesion +
                ", hora_inicio='" + hora_inicio + '\'' +
                ", hora_fin='" + hora_fin + '\'' +
                ", id_aula='" + id_aula + '\'' +
                ", id_asignatura='" + id_asignatura + '\'' +
                '}';
    }
}
