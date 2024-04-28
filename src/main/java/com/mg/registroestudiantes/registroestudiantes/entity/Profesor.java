package com.mg.registroestudiantes.registroestudiantes.entity;

import jakarta.persistence.Entity;

@Entity
public class Profesor {
    private Integer profesor_Id;
    private String rut;
    private String nombre;

    public Integer getProfesor_Id() {
        return profesor_Id;
    }

    public void setProfesor_Id(Integer profesor_Id) {
        this.profesor_Id = profesor_Id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
