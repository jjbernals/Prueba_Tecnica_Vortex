package com.example.demo.service;

import com.example.demo.entity.Conductor;

import java.util.List;

public interface ConductorService {
    void crearConductor(Conductor conductor);
    List<Conductor> obtenerTodosLosConductores ();
}
