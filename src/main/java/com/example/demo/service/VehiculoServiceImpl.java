package com.example.demo.service;

import com.example.demo.entity.Conductor;
import com.example.demo.entity.Vehiculo;
import com.example.demo.exception.ConductorNotFoundException;
import com.example.demo.exception.VehiculoNotFoundException;
import com.example.demo.repository.ConductorRepository;
import com.example.demo.repository.VehiculoRepository;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;
import java.util.List;
import java.util.Optional;

@Service
public class VehiculoServiceImpl implements VehiculoService{
    private final VehiculoRepository vehiculoRepository;
    private final ConductorRepository conductorRepository;

    public VehiculoServiceImpl(VehiculoRepository vehiculoRepository, ConductorRepository conductorRepository) {
        this.vehiculoRepository = vehiculoRepository;
        this.conductorRepository = conductorRepository;
    }

    @Override
    public void crearVehiculo(Vehiculo vehiculo) {
        vehiculoRepository.save(vehiculo);
    }

    @Override
    public void asociarVehiculoAConductor(int idVehiculo, int idConductor) {
        Conductor conductor = conductorRepository.findById(idConductor).orElseThrow(()->new ConductorNotFoundException("El conductor no se encuentra registrado"));
        Vehiculo vehiculo = vehiculoRepository.findById(idVehiculo).orElseThrow(()->new VehiculoNotFoundException("El vehiculo no se encuentra disponible"));
        vehiculo.setDriver(conductor);
        vehiculoRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculo> obtenerTodosLosVehiculos() {
        return vehiculoRepository.findAll();
    }

    @Override
    public Optional<List<Vehiculo>> obtenerVehiculosNoAsociados() {
        return vehiculoRepository.obtenerVehiculosSinAsociacion();
    }

    @Override
    public Optional<List<Vehiculo>> obtenerVehiculosAsociadosAConductor(int idConductor) {
        return vehiculoRepository.obtenerVehiculosConAsociacion(idConductor);
    }

    @Override
    public void desasociarUnVehiculo(int idVehiculo) {
        Vehiculo vehiculo = vehiculoRepository.findById(idVehiculo).orElseThrow(()->new VehiculoNotFoundException("No se encuentra disponible este vehiculo"));
        vehiculo.setDriver(null);
        vehiculoRepository.save(vehiculo);
    }
}
