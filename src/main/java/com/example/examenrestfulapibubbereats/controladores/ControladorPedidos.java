package com.example.examenrestfulapibubbereats.controladores;

import com.example.examenrestfulapibubbereats.servicios.ServicioPedidos;
import com.example.examenrestfulapibubbereats.entidades.Pedido;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pedidos")
public class ControladorPedidos {
    private final ServicioPedidos servicioPedidos;

    public ControladorPedidos(ServicioPedidos servicioPedidos) {
        this.servicioPedidos = servicioPedidos;
    }

    @GetMapping()
    public List<Pedido> obtenerPedidos(){return servicioPedidos.obtenerPedidos();}

    @GetMapping("/{id}")
    public Pedido getServicioPedidos(@PathVariable int id) {return servicioPedidos.obtenerPrimero(id);
    }
}
