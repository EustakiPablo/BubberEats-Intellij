package com.example.examenrestfulapibubbereats.servicios;

import com.example.examenrestfulapibubbereats.entidades.Cliente;
import com.example.examenrestfulapibubbereats.entidades.Pedido;
import com.example.examenrestfulapibubbereats.repositorios.RepositorioPedidos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioPedidos {
    private final RepositorioPedidos repositorioPedidos;

    public ServicioPedidos(RepositorioPedidos repositorioPedidos) {
        this.repositorioPedidos = repositorioPedidos;
    }
    public List<Pedido> obtenerPedidos(){return repositorioPedidos.findAll();}

    public Pedido obtenerPrimero(int id){return repositorioPedidos.findByIdCliente(new Cliente(id));}
}
