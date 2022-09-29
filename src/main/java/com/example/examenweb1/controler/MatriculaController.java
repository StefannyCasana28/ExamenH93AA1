package com.example.examenweb1.controler;


import com.example.examenweb1.entity.MatriculaEntity;
import com.example.examenweb1.interfa.MatriculaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/matricula")
public class MatriculaController {

    @Autowired
    private MatriculaInterface matriculaInterface;

    @GetMapping
    public List<MatriculaEntity> busquedadmatricula() {
        return (List<MatriculaEntity>) matriculaInterface.findAll();
    }

    @PostMapping
    public void crearMatricula(@RequestBody MatriculaEntity MatEnt) {matriculaInterface.save(MatEnt);}

    @PutMapping
    public void actualizarmatricula(@RequestBody MatriculaEntity MatEnt) {
        matriculaInterface.save(MatEnt);
    }

    @PutMapping (value = "/{id}")
    public ResponseEntity<MatriculaEntity> actualizarMatriculaEspecifico (@PathVariable ("id") Integer id, @RequestBody MatriculaEntity MatEntJson) {
        MatriculaEntity DatCliEntBD = matriculaInterface.findById(id).orElseThrow();
        System.out.println(DatCliEntBD.getIdalumno());

        //Apellido vacio
        if (!(MatEntJson.getIdcurso() == null)) {
            DatCliEntBD.setIdcurso(MatEntJson.getIdcurso());
        }
        //Correo Vacio
        if (!(MatEntJson.getIdmatricula() == null)) {
            DatCliEntBD.setIdmatricula(MatEntJson.getIdmatricula());
        }


        MatriculaEntity MatEntBDActu = matriculaInterface.save(DatCliEntBD);

        return ResponseEntity.ok(MatEntBDActu);
    }
}
