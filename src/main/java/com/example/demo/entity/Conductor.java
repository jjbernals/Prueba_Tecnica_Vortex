package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "driver")
public class Conductor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 11, nullable = false )
    private String identificacion;

    @Column(length = 20, nullable = false)
    private String apellido;

    @Column(length = 20, nullable = false)
    private String nombre;

    @Column(length = 10, nullable = false)
    private String telefono;

    @Column(length = 50)
    private String direccion;

}
