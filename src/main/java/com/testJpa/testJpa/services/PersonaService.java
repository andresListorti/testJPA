package com.testJpa.testJpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testJpa.testJpa.model.Ciudad;
import com.testJpa.testJpa.model.Persona;
import com.testJpa.testJpa.repository.PersonaRepository;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }

    // public Persona getById(long id) {
    //     return personaRepository.findById(id).get();
    // }

    // public void agregarPersona(Persona persona) {
    //     personaRepository.save(persona);
    // }

    // public List<Persona> buscarPersonaPorNombre(String nombre) {
    //     if (personaRepository.findByNombre(nombre).isEmpty()) {
    //         throw new IllegalArgumentException("No se encontraron personas con el nombre: " + nombre);
    //     }
    //     return personaRepository.findByNombre(nombre);
    // }

    // public List<Persona> buscarPorNombreApellido(String nombre, String apellido) {
    //     if (personaRepository.findByNombreAndApellido(nombre, apellido).isEmpty()) {
    //         throw new IllegalArgumentException(
    //                 "No se encontraron personas con el nombre: " + nombre + " y el apellido: " + apellido);
    //     }
    //     return personaRepository.findByNombreAndApellido(nombre, apellido);
    // }

    // public List<Persona> buscarPorCiudad(Ciudad ciudad) {
    //     return personaRepository.findByCiudad(ciudad);
    // }

    // public Persona findByDni(String dni) {
    //     return this.personaRepository.findByDni(dni);
    // }
    

}
