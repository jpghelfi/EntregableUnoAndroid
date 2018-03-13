package com.company;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    protected String nombre;

    protected Integer codigoDeCurso;

    protected ProfesorTitular profesorTitular;

    protected ProfesorAdjunto profesorAdjunto;

    protected Integer cupoMaximo;

    protected List<Alumno> listaDeAlumnos;

    public Curso(String nombre, Integer codigoDeCurso, Integer cupoMaximo) {
        this.nombre = nombre;
        this.codigoDeCurso = codigoDeCurso;
        this.profesorTitular = profesorTitular;
        this.profesorAdjunto = profesorAdjunto;
        this.cupoMaximo = cupoMaximo;
        this.listaDeAlumnos = new ArrayList<Alumno>();
    }

    public void setProfesorAdjunto(ProfesorAdjunto profesorAdjunto) {
        this.profesorAdjunto = profesorAdjunto;
    }

    public void setProfesorTitular(ProfesorTitular profesorTitular) {
        this.profesorTitular = profesorTitular;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCodigoDeCurso() {
        return codigoDeCurso;
    }

    public boolean equals(Integer codigo) {

        return codigo.equals(this.codigoDeCurso);
    }

    public Boolean agregarUnAlumno(Alumno unAlumno){

        if(hayCupo()){
            return this.listaDeAlumnos.add(unAlumno);
        }
        System.out.println("No Hay cupo para el curso " + this.nombre);
        return false;

    }

    public Boolean hayCupo(){
        return this.cupoMaximo > this.listaDeAlumnos.size();
    }

    public void eliminarAlumno(Alumno unAlumno){
        Alumno alumnoARemover = null;
        for (Alumno alumno: this.listaDeAlumnos) {
            if(alumno.equals(unAlumno)){
                alumnoARemover = alumno;
            }
        }
        this.listaDeAlumnos.remove(alumnoARemover);
    }
}
