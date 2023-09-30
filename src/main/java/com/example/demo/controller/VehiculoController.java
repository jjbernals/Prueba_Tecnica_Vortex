package com.example.demo.controller;

import com.example.demo.entity.Vehiculo;
import com.example.demo.service.VehiculoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {
    private final VehiculoServiceImpl vehiculoService;

    public VehiculoController(VehiculoServiceImpl vehiculoService) {
        this.vehiculoService = vehiculoService;
    }

    @GetMapping
    public List<Vehiculo> obtenerTodosLosVehiculos(){return vehiculoService.obtenerTodosLosVehiculos();}

    @GetMapping("/no-asociados")
    public Optional<List<Vehiculo>> obtenerTodosLosVehiculosNoAsociados(){return vehiculoService.obtenerVehiculosNoAsociados();}

    @GetMapping("/asociados/{idConductor}")
    public Optional<List<Vehiculo>> obtenerTodosLosVehiculosAsociados(@PathVariable int idConductor){return vehiculoService.obtenerVehiculosAsociadosAConductor(idConductor);}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearVehiculo(@RequestBody Vehiculo vehiculo){ vehiculoService.crearVehiculo(vehiculo); }

    @PatchMapping("/asociar/{idVehiculo}/{idConductor}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void asociarVehiculoAConductor(@PathVariable int idVehiculo, @PathVariable int idConductor){ vehiculoService.asociarVehiculoAConductor(idVehiculo, idConductor); }

    @PatchMapping("/desasociar/{idVehiculo}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void desasociarUnConductorAVehiculo(@PathVariable int idVehiculo){ vehiculoService.desasociarUnVehiculo(idVehiculo); }
}
