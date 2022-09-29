package com.example.examenweb1.entity;


import javax.persistence.*;

@Entity
@Table (name="matricula")

public class MatriculaEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name= "idmatricula")
    private Integer Idmatricula;

    @Column (name= "idcurso")
    private Integer Idcurso;

    @Column (name= "idalumno")
    private Integer Idalumno;

    public Integer getIdmatricula() { return  Idmatricula;}
    public void setIdmatricula(Integer idmatricula) { Idmatricula = idmatricula;}

    public Integer getIdcurso() { return  Idcurso;}
    public void setIdcurso(Integer idcurso) { Idcurso = idcurso;}

    public Integer getIdalumno() { return  Idalumno;}
    public void setIdalumno(Integer idalumno) { Idalumno = idalumno;}



}
