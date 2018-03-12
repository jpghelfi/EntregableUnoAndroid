package com.company;

public class Alumno {

    protected String nombre;

    protected String apellido;

    protected Integer codigoAlumno;

    public Alumno(String nombre, String apellido, Integer codigoAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoAlumno = codigoAlumno;
    }

    public Integer getCodigoAlumno() {
        return codigoAlumno;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {

        Alumno unAlumno = (Alumno) obj;

        return unAlumno.getCodigoAlumno() == this.codigoAlumno;
    }
}
