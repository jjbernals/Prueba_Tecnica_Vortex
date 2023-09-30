package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "pedido")
public class Pedido {

    @Id
    private int id;

    @Column(length = 20)
    private String tipo_pedido;

    @Column(length = 50, nullable = false)
    private String direccion;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_conductor")
    private Conductor car;

}
