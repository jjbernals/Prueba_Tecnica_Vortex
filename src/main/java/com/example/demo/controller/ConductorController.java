package com.example.demo.controller;

import com.example.demo.entity.Conductor;
import com.example.demo.service.ConductorServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conductor")
public class ConductorController {
    private final ConductorServiceImpl conductorService;

    public ConductorController(ConductorServiceImpl conductorService) {
        this.conductorService = conductorService;
    }

    @GetMapping
    public List<Conductor> obtenerTodosLosConductores(){
        return conductorService.obtenerTodosLosConductores();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearConductor(@RequestBody Conductor conductor){conductorService.crearConductor(conductor);}
}
