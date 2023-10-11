package com.example.RepositorioAulas.domain;

public class Docente {

    private String email;
    private String nombre;


    public Docente(String email, String nombre) {
        this.email = email;
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "email='" + email + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
