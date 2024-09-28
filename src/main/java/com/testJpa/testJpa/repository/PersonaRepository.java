package com.testJpa.testJpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.testJpa.testJpa.model.Ciudad;
import com.testJpa.testJpa.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

    // Persona findByDni(String dni);

    // List<Persona> findByNombre(String nombre);

    // @Query("SELECT p FROM Persona p JOIN p.direccion d WHERE p.nombre = :nombre AND p.apellido = :apellido")
    // List<Persona> findByNombreAndApellido(@Param("nombre") String nombre,
    //         @Param("apellido") String apellido);

    // @Query("SELECT p FROM Persona p JOIN p.direccion d WHERE d.ciudad = :ciudad")
    // List<Persona> findByCiudad(@Param("ciudad") Ciudad ciudad);

}
