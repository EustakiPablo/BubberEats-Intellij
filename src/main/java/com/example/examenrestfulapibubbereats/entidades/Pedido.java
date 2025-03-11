package com.example.examenrestfulapibubbereats.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "pedidos")
@NamedQueries({
        @NamedQuery(name = "Pedido.findAll", query = "SELECT a FROM Pedido a"),
        @NamedQuery(name = "Pedido.findByIdCliente", query = "SELECT a FROM Pedido a WHERE idCliente = :id")
})
public class Pedido implements Serializable {
    @Id
    @Column(name = "id_pedido", nullable = false)
    private Integer id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente")
    private Cliente idCliente;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_restaurante")
    private Restaurante idRestaurante;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_repartidor")
    private Repartidore idRepartidor;

    @Lob
    @Column(name = "detalles")
    private String detalles;

    @Column(name = "estado", length = 20)
    private String estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Restaurante getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(Restaurante idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public Repartidore getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(Repartidore idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}