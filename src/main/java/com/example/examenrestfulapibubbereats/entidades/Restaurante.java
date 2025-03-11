package com.example.examenrestfulapibubbereats.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "restaurantes")
@NamedQueries({
        @NamedQuery(name = "Restaurante.findAll", query = "SELECT a FROM Restaurante a")
})
public class Restaurante {
    @Id
    @Column(name = "id_restaurante", nullable = false)
    private Integer id;

    @Column(name = "nombre_restaurante", nullable = false, length = 100)
    private String nombreRestaurante;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @JsonIgnore
    @OneToMany(mappedBy = "idRestaurante")
    private Set<Pedido> pedidos = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

}