package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "vehicle")
public class Vehiculo {
    @Id
    @Column(length = 6)
    private int id;

    @Column(length = 4, nullable = false)
    private String modelo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public Conductor getDriver() {
        return driver;
    }

    public void setDriver(Conductor driver) {
        this.driver = driver;
    }

    @Column(length = 7, nullable = false)
    private String placa;

    @Column(length = 7)
    private String capacidad;

    @ManyToOne
    @JoinColumn(name = "id_conductor")
    private Conductor driver;
}
