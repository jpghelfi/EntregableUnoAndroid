package com.company;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    protected String nombre;

    protected String apellido;

    protected Integer codigoAlumno;

    protected List<Curso> listadoDeCursos;

    public Alumno(String nombre, String apellido, Integer codigoAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoAlumno = codigoAlumno;
        this.listadoDeCursos = new ArrayList<Curso>();
    }

    public void imprimirListadoCursos(){
        for (Curso curso: this.listadoDeCursos) {
            System.out.println("Alumno " + this.nombre + " inscripto en curso " + curso.nombre);
        }
    }

    public void agregarCurso(Curso curso){
        this.listadoDeCursos.add(curso);
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

        return unAlumno.getCodigoAlumno().equals(this.codigoAlumno);
    }
}
