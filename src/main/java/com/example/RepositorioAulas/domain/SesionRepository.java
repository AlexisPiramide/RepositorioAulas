package com.example.RepositorioAulas.domain;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public interface SesionRepository {

    public List<Object> getAllAulas();

    public List<Sesion> getALl(String id_aula);
}
