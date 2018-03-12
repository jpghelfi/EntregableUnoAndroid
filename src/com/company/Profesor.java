package com.company;

public class Profesor {

    protected String nombre;

    protected String apellido;

    protected Integer antiguedad;

    protected Integer codigoDeProfesor;

    public Profesor(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
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

    @Override
    public boolean equals(Object obj) {

        Profesor unProfesor = (Profesor) obj;

        return unProfesor.getCodigoDeProfesor() == this.codigoDeProfesor;
    }
}
