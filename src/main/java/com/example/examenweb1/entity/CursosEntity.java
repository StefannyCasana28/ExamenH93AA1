package com.example.examenweb1.entity;

import javax.persistence.*;

@Entity
@Table (name = "cursos")
public class CursosEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name= "idcurso")
    private Integer Idcurso;

    @Column (name= "nomcurso")
    private String Nomcurso;

    @Column (name= "creditos")
    private String Creditos;

    public Integer getIdcurso() {return Idcurso;}
    public void setIdcurso(Integer idcurso) {Idcurso =idcurso;}

    public String getNomcurso() {return Nomcurso;}
    public void setNomcurso(String nomcurso) {Nomcurso = nomcurso;}

    public String getCreditos() {return Creditos;}
    public void setCreditos(String creditos) {Creditos = creditos;}

}
