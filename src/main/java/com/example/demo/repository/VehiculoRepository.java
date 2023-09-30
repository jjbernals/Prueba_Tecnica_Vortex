package com.example.demo.repository;

import com.example.demo.entity.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {
    @Query(value = "SELECT vehiculo FROM Vehiculo vehiculo WHERE vehiculo.driver = null")
    Optional<List<Vehiculo>> obtenerVehiculosSinAsociacion();

    @Query(value = "SELECT vehiculo FROM Vehiculo vehiculo WHERE vehiculo.driver.id =:id")
    Optional<List<Vehiculo>> obtenerVehiculosConAsociacion(int id);
}
