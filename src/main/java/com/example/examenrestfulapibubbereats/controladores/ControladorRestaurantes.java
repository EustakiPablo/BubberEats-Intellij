package com.example.examenrestfulapibubbereats.controladores;

import com.example.examenrestfulapibubbereats.servicios.ServicioRestaurantes;
import com.example.examenrestfulapibubbereats.entidades.Restaurante;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("restaurantes")
public class ControladorRestaurantes {
    private final ServicioRestaurantes servicioRestaurantes;

    public ControladorRestaurantes(ServicioRestaurantes servicioRestaurantes) {
        this.servicioRestaurantes = servicioRestaurantes;
    }

    @GetMapping()
    public List<Restaurante> listarDepartamentos() {
        return servicioRestaurantes.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Restaurante mostrarPrimerDepartamento(@PathVariable int id) {return servicioRestaurantes.obtenerPrimero(id);}

}
