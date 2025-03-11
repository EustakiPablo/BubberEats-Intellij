package com.example.examenrestfulapibubbereats.repositorios;

import com.example.examenrestfulapibubbereats.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioClientes extends JpaRepository<Cliente, Integer> {

}
