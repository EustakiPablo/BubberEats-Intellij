package com.example.examenrestfulapibubbereats.controladores;

import com.example.examenrestfulapibubbereats.servicios.ServicioClientes;
import com.example.examenrestfulapibubbereats.entidades.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ControladorClientes {
    private final ServicioClientes servicioClientes;

    public ControladorClientes(ServicioClientes servicioClientes) {
        this.servicioClientes = servicioClientes;
    }

    @GetMapping()
    public List<Cliente> listarDepartamentos() {
        return servicioClientes.obtenerTodos();
    }
}
