package com.example.examenrestfulapibubbereats.repositorios;

import com.example.examenrestfulapibubbereats.entidades.Cliente;
import com.example.examenrestfulapibubbereats.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioPedidos extends JpaRepository<Pedido, Integer> {

    Pedido findByIdCliente(Cliente id);
}
