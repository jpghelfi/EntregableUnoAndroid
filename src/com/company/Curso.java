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

    public Curso(String nombre, Integer codigoDeCurso, ProfesorTitular profesorTitular, ProfesorAdjunto profesorAdjunto, Integer cupoMaximo) {
        this.nombre = nombre;
        this.codigoDeCurso = codigoDeCurso;
        this.profesorTitular = profesorTitular;
        this.profesorAdjunto = profesorAdjunto;
        this.cupoMaximo = cupoMaximo;
        this.listaDeAlumnos = new ArrayList<Alumno>();
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCodigoDeCurso() {
        return codigoDeCurso;
    }

    @Override
    public boolean equals(Object obj) {

        Curso unCurso = (Curso) obj;

        return unCurso.getCodigoDeCurso() == this.codigoDeCurso;
    }
}
