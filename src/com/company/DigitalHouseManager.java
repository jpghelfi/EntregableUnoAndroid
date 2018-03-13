package com.company;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    protected List<Alumno> listaAlumnos;

    protected List<Profesor> listaProfesores;

    protected List<Curso> listaCursos;

    protected List<Inscripcion> listaInscripciones;

    public DigitalHouseManager() {

        this.listaAlumnos = new ArrayList<Alumno>();
        this.listaProfesores = new ArrayList<Profesor>();
        this.listaCursos = new ArrayList<Curso>();
        this.listaInscripciones = new ArrayList<Inscripcion>();
    }

    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos){

        this.listaCursos.add(new Curso(nombre, codigoCurso, cupoMaximoDealumnos));
    }

    public void bajaCurso(Integer codigoCurso){

        Curso cursoARemover = null;
        for (Curso curso: this.listaCursos) {
            if (curso.getCodigoDeCurso() == codigoCurso){
                cursoARemover = curso;
            }
        }
        this.listaCursos.remove(cursoARemover);
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras){
        this.listaProfesores.add(new ProfesorAdjunto(nombre,apellido,codigoProfesor,cantidadDeHoras));
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad){

        this.listaProfesores.add(new ProfesorTitular(nombre, apellido, codigoProfesor, especialidad));
    }

    public void bajaProfesor(Integer codigoProfesor){

        Profesor profesorARemover = null;
        for (Profesor profesor: this.listaProfesores) {
            if (profesor.getCodigoDeProfesor() == codigoProfesor){
                profesorARemover = profesor;
            }
        }
        this.listaProfesores.remove(profesorARemover);
    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno){

        this.listaAlumnos.add(new Alumno(nombre, apellido, codigoAlumno));
    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso){

        try {
            Curso curso = this.buscarCurso(codigoCurso);
            Alumno alumno = this.buscarAlumno(codigoAlumno);

            if (curso.agregarUnAlumno(alumno)){
                Inscripcion inscripcion = new Inscripcion(alumno,curso);
                alumno.agregarCurso(curso);
                System.out.println("Inscripcion relizada con exito de  Alumno " + alumno.getNombre() + " en curso " + curso.getNombre());

            }else{
                System.out.println("NO HAY CUPO: No se pudo inscribir al Alumno " + alumno.getNombre() + " en el curso " + curso.getNombre());
            }

        }catch (Exception e){
            System.out.println("Error: no se pudo inscribir al alumno " + codigoAlumno + " en el curso " + codigoCurso);
        }
    }

    private Curso buscarCurso(Integer codigoCurso){
        for (Curso curso: this.listaCursos) {
            if (curso.equals(codigoCurso)){
                return curso;
            }
        }
        return null;
    }

    private Alumno buscarAlumno(Integer codigoAlumno){
        for (Alumno alumno: this.listaAlumnos) {
            if (alumno.getCodigoAlumno().equals(codigoAlumno)){
                return alumno;
            }
        }
        return null;
    }

    private ProfesorTitular buscarProfesorTitular(Integer codigoProfesor){
        for (Profesor profesorTitular: this.listaProfesores)
            if (profesorTitular.equals(codigoProfesor)) {
                return (ProfesorTitular) profesorTitular;
            }
        return null;
    }

    private ProfesorAdjunto buscarProfesorAdjunto(Integer codigoProfesor){
        for (Profesor profesorAdjunto: this.listaProfesores)
            if (profesorAdjunto.equals(codigoProfesor)) {
                return (ProfesorAdjunto) profesorAdjunto;
            }
        return null;
    }

    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto){

        Curso curso = null;

        try {
            curso = this.buscarCurso(codigoCurso);
            curso.setProfesorTitular(this.buscarProfesorTitular(codigoProfesorTitular));
            curso.setProfesorAdjunto(this.buscarProfesorAdjunto(codigoProfesorAdjunto));

        }catch (Exception e){
            System.out.println("No se pudo asigar los profesores al curso " + codigoCurso );

        }

    }

    public void imprimirListadoDeCursosDeListadoDeAlumnos(){
        for (Alumno alumno: this.listaAlumnos) {

            alumno.imprimirListadoCursos();

        }
    }







}
