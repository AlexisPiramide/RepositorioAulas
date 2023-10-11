package com.example.RepositorioAulas;

public class Aula {

    private String id_aula,dia,profesor, id_asignatura;
    private Integer id_sesion, hora_inicio, hora_fin;

    public Aula(String idAula, String dia, String profesor, String id_asignatura, Integer id_sesion, Integer hora_inicio, Integer hora_fin) {
        this.id_aula = idAula;
        this.dia = dia;
        this.profesor = profesor;
        this.id_asignatura = id_asignatura;
        this.id_sesion = id_sesion;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
    }

    public String getId_aula() {
        return id_aula;
    }

    public void setId_aula(String id_aula) {
        this.id_aula = id_aula;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getId_asignatura() {
        return id_asignatura;
    }

    public void setId_asignatura(String id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public Integer getId_sesion() {
        return id_sesion;
    }

    public void setId_sesion(Integer id_sesion) {
        this.id_sesion = id_sesion;
    }

    public Integer getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(Integer hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Integer getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(Integer hora_fin) {
        this.hora_fin = hora_fin;
    }
}
