package com.company;

public class Profesor {

    protected String nombre;

    protected String apellido;

    protected Integer antiguedad;

    protected Integer codigoDeProfesor;

    public Profesor(String nombre, String apellido, Integer codigoDeProfesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = 0;
        this.codigoDeProfesor = codigoDeProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public Integer getCodigoDeProfesor() {
        return codigoDeProfesor;
    }


}
