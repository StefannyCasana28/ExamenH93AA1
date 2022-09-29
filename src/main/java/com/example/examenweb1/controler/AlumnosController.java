package com.example.examenweb1.controler;

import com.example.examenweb1.entity.AlumnosEntity;
import com.example.examenweb1.interfa.AlumnosInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/alumnos")
public class AlumnosController {

    @Autowired
    private AlumnosInterface alumnosInterface;

    @GetMapping
    public List<AlumnosEntity> busquedadAlumnos() {
        return (List<AlumnosEntity>) alumnosInterface.findAll();
    }

    @PostMapping
    public void crearAlumnos(@RequestBody AlumnosEntity AlumEnt) {
        alumnosInterface.save(AlumEnt);
    }

    @PutMapping
    public void actualizarAlumnos(@RequestBody AlumnosEntity AlumEnt) {
        alumnosInterface.save(AlumEnt);
    }

    @PutMapping (value = "/{id}")
    public ResponseEntity<AlumnosEntity> actualizarAlumnosEspecifico (@PathVariable ("id") Integer id, @RequestBody AlumnosEntity AlumEntJson) {
        AlumnosEntity AlumnEntBD = alumnosInterface.findById(id).orElseThrow();
        System.out.println(AlumnEntBD.getNombalumno());

        //Apellido vacio
        if (!(AlumEntJson.getApelalumno() == null)) {
            AlumnEntBD.setApelalumno(AlumEntJson.getApelalumno());
        }
        //Correo Vacio
        if (!(AlumEntJson.getCorreo() == null)) {
            AlumnEntBD.setCorreo(AlumEntJson.getCorreo());
        }

        //Edad Vacio
        if (!(AlumEntJson.getEdad() == null)) {
            AlumnEntBD.setEdad(AlumEntJson.getEdad());
        }

        //ip Vacio
        if (!(AlumEntJson.getIporigen() == null)) {
            AlumnEntBD.setIporigen(AlumEntJson.getIporigen());
        }

        AlumnosEntity AlumEntBDActu = alumnosInterface.save(AlumnEntBD);

        return ResponseEntity.ok(AlumEntBDActu);
    }
}
