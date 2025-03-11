package com.example.examenrestfulapibubbereats.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "repartidores")
public class Repartidore {
    @Id
    @Column(name = "id_repartidor", nullable = false)
    private Integer id;

    @Column(name = "nombre_repartidor", nullable = false, length = 100)
    private String nombreRepartidor;

    @Column(name = "telefono", nullable = false, length = 15)
    private String telefono;

    @JsonIgnore
    @OneToMany(mappedBy = "idRepartidor")
    private Set<Pedido> pedidos = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreRepartidor() {
        return nombreRepartidor;
    }

    public void setNombreRepartidor(String nombreRepartidor) {
        this.nombreRepartidor = nombreRepartidor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

}