package com.example.demo.service;

import com.example.demo.entity.Vehiculo;

import java.util.List;
import java.util.Optional;

public interface VehiculoService {
    void crearVehiculo(Vehiculo vehiculo);
    void asociarVehiculoAConductor(int idVehiculo, int idConductor);
    List<Vehiculo> obtenerTodosLosVehiculos();
    Optional<List<Vehiculo>> obtenerVehiculosNoAsociados();
    Optional<List<Vehiculo>> obtenerVehiculosAsociadosAConductor(int idConductor);
    void desasociarUnVehiculo(int idVehiculo);
}
