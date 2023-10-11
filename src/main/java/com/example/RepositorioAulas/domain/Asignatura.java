package com.example.RepositorioAulas.domain;

public class Asignatura {

    private String id_asignatura;
    private String ciclo;
    private String nombre;
    private Integer curso;


    public Asignatura(String id_asignatura, String ciclo, String nombre, Integer curso) {
        this.id_asignatura = id_asignatura;
        this.ciclo = ciclo;
        this.nombre = nombre;
        this.curso = curso;
    }

    public String getId_asignatura() {
        return id_asignatura;
    }

    public void setId_asignatura(String id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "id_asignatura='" + id_asignatura + '\'' +
                ", ciclo='" + ciclo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", curso=" + curso +
                '}';
    }
}
