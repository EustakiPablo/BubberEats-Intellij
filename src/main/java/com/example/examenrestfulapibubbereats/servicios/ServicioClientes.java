package com.example.examenrestfulapibubbereats.servicios;

import com.example.examenrestfulapibubbereats.entidades.Cliente;
import com.example.examenrestfulapibubbereats.repositorios.RepositorioClientes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioClientes {
    private final RepositorioClientes repositorioClientes;

    public ServicioClientes(RepositorioClientes repositorioClientes) {
        this.repositorioClientes = repositorioClientes;
    }

    public List<Cliente> obtenerTodos(){
        return repositorioClientes.findAll();
    }
}
