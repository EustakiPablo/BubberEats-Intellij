package com.example.examenrestfulapibubbereats.servicios;

import com.example.examenrestfulapibubbereats.entidades.Restaurante;
import com.example.examenrestfulapibubbereats.repositorios.RepositorioRestaurantes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioRestaurantes {
    private final RepositorioRestaurantes repositorioRestaurantes;

    public ServicioRestaurantes(RepositorioRestaurantes repositorioRestaurantes) {
        this.repositorioRestaurantes = repositorioRestaurantes;
    }

    public List<Restaurante> obtenerTodos(){
        return repositorioRestaurantes.findAll();
    }

    public Restaurante obtenerPrimero(int id){return repositorioRestaurantes.findById(id).get();}
}
