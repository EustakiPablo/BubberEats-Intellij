package com.example.examenrestfulapibubbereats.repositorios;

import com.example.examenrestfulapibubbereats.entidades.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioRestaurantes extends JpaRepository<Restaurante, Integer> {

}
