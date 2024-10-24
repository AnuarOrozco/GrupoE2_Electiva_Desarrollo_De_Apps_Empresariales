package com.uvm.springboot.controller;

import com.uvm.springboot.domain.Alumno;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    private List<Alumno> alumnos = new ArrayList<>(Arrays.asList(
            new Alumno(12345, "Valentina", "Gómez del Campo", "Calle de los Robles 124, Colonia Lomas", "5541234567", "valentina.gomez@uvm.net"),
            new Alumno(23456, "Alejandro", "Montenegro de la Cruz", "Avenida de la Reforma 987, Centro", "5534567890", "alejandro.montenegro@uvm.net"),
            new Alumno(34567, "Isabella", "Rodríguez Lafarga", "Paseo de los Olivos 67, Jardines del Pedregal", "5529876543", "isabella.rodriguez@uvm.net"),
            new Alumno(45678, "Santiago", "Villaseñor del Río", "Calle Magnolia 345, Residencial La Fuente", "5567890123", "santiago.villasenor@uvm.net"),
            new Alumno(56789, "Sofía", "Cáceres Paredes", "Calle de las Palmas 890, Colonia Bosques", "5545678901", "sofia.caceres@uvm.net"),
            new Alumno(67890, "Emilio", "Salinas Argüelles", "Boulevard del Río 123, Valle Real", "5523456789", "emilio.salinas@uvm.net")
    ));

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Alumno>> getAlumnos() {
        return ResponseEntity.ok(alumnos);
    }

    @RequestMapping(value = "/{matricula}", method = RequestMethod.GET)
    public ResponseEntity<?> getAlumno(@PathVariable Integer matricula) {
        for (Alumno a : alumnos) {
            if (a.getMatricula() == matricula) {
                return ResponseEntity.ok(a);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Alumno con matricula: " + matricula + " no encontrado");
    }

    public ResponseEntity<?> postAlumno(@RequestBody Alumno alumno) {
        alumnos.add(alumno);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{matricula}").buildAndExpand(alumno.getMatricula())
                .toUri();

        return ResponseEntity.created(location).body(alumno);
    }

}
