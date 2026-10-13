
package com.example.test.model;

public class Estudiante {

    private int id;
    private String nombre;
    private String correo;
    private int edad;

    public Estudiante(
            int id,
            String nombre,
            String correo,
            int edad) {

        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }
}