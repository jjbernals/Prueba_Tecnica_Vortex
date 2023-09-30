package com.example.demo.service;

import com.example.demo.entity.Conductor;
import com.example.demo.repository.ConductorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConductorServiceImpl implements ConductorService{
    private final ConductorRepository conductorRepository;

    public ConductorServiceImpl(ConductorRepository conductorRepository) {
        this.conductorRepository = conductorRepository;
    }

    @Override
    public void crearConductor(Conductor conductor) {
        conductorRepository.save(conductor);
    }

    @Override
    public List<Conductor> obtenerTodosLosConductores() {
        return conductorRepository.findAll();
    }
}
