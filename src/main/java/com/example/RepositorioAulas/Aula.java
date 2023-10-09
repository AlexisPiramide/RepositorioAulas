package com.example.RepositorioAulas;

public class Aula {

    private String idAula,dia,profesor,materia;
    private Integer nºSesion,horaInicio,horaFin;

    public Aula(String idAula, String dia, String profesor, String materia, Integer nºSesion, Integer horaInicio, Integer horaFin) {
        this.idAula = idAula;
        this.dia = dia;
        this.profesor = profesor;
        this.materia = materia;
        this.nºSesion = nºSesion;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getIdAula() {
        return idAula;
    }

    public String getDia() {
        return dia;
    }

    public String getProfesor() {
        return profesor;
    }

    public String getMateria() {
        return materia;
    }

    public Integer getNºSesion() {
        return nºSesion;
    }

    public Integer getHoraInicio() {
        return horaInicio;
    }

    public Integer getHoraFin() {
        return horaFin;
    }
}
