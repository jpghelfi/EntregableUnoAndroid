package com.company;

import java.util.Date;

public class Inscripcion {

    protected Alumno alumno;

    protected Curso curso;

    protected Date fecha;

    public Inscripcion(Alumno alumno, Curso curso) {
        this.alumno = alumno;
        this.curso = curso;
        this.fecha = new Date();
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Curso getCurso() {
        return curso;
    }

    public Date getFecha() {
        return fecha;
    }


}
