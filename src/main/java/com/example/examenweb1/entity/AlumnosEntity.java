package com.example.examenweb1.entity;


import javax.persistence.*;
import java.net.InetAddress;
import java.util.Arrays;

import static java.net.InetAddress.getLocalHost;

@Entity
@Table (name="alumnos")

public class AlumnosEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name= "idalumno")
    private Integer Idalumno;

    @Column (name= "nombalumno")
    private String Nombalumno;

    @Column (name= "apelalumno")
    private String Apelalumno;

    @Column (name= "correo")
    private String Correo;

    @Column (name= "edad")
    private Integer Edad;

    @Column (name= "iporigen")
    private String Iporigen = Arrays.toString(InetAddress.getLoopbackAddress().getAddress());

    public Integer getIdalumno() { return  Idalumno;}
    public void setIdalumno(Integer idalumno) { idalumno = idalumno;}

    public String getNombalumno() {return Nombalumno;}
    public void setNombalumno(String nombalumno) {Nombalumno = nombalumno;}

    public String getApelalumno() {return Apelalumno;}
    public void setApelalumno(String apelalumno) {Apelalumno = apelalumno;}

    public String getCorreo() {return Correo;}
    public void setCorreo(String correo) {Correo = correo;}

    public Integer getEdad() {return Edad;}
    public void setEdad(Integer edad) {Edad = edad;}

    public String getIporigen() {return Iporigen;}
    public void setIporigen(String iporigen) {Iporigen = iporigen;}

}
