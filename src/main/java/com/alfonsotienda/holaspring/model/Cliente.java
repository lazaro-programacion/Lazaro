package com.alfonsotienda.holaspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id // pk no nula
    @GeneratedValue(strategy = GenerationType.AUTO) // auto increment
    private Integer id;

    @NotNull //no nulo
    private String nombre;

    @NotNull // no nulo
    @Size(max = 300)
    @Column(name = "surname")
    private String apellido;

    @NotNull
    @Min(value = 16) // limita edad a más de 15
    @Max(value = 65) // y menos de 65 saltará error 500
    private Integer edad;


    public Cliente() {
    }

    public Cliente(@NotNull String nombre, 
                    @NotNull String apellido, 
                    @NotNull @Min(16) @Max(65) Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente [apellido=" + apellido + ", edad=" + edad + ", id=" + id + ", nombre=" + nombre + "]";
    }



}