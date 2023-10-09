package com.example.RepositorioAulas;

public class Aula {

    private String idAula,dia,nºSesion,horaInicio,horaFin,profesor,materia;

    public Aula(String idAula, String dia, String nºSesion, String horaInicio, String horaFin, String profesor, String materia) {
        this.idAula = idAula;
        this.dia = dia;
        this.nºSesion = nºSesion;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.profesor = profesor;
        this.materia = materia;
    }
}
