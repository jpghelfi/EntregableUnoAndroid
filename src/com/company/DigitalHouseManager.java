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

        if(!this.isCurso(codigoCurso)){
            this.listaCursos.add(new Curso(nombre, codigoCurso, cupoMaximoDealumnos));
            this.altaCorrecta("Curso", nombre);
        }else{
            this.altaIncorrecta("Curso", nombre);

        }
    }

    private void altaCorrecta(String tipo, String nombre){
        System.out.println(tipo + " " + nombre + " dado de alta correctamente");
    }

    private void altaIncorrecta(String tipo, String nombre){
        System.out.println(tipo + " " + nombre + " no se pudo de alta");
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

        if(!this.isProfesorAdjunto(codigoProfesor)){
            this.listaProfesores.add(new ProfesorAdjunto(nombre,apellido,codigoProfesor,cantidadDeHoras));
            this.altaCorrecta("Profesor Adjunto", apellido);

        }else{
            this.altaIncorrecta("Profesor Adjunto", apellido);

        }

    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad){

        if(!this.isProfesorTitular(codigoProfesor)){
            this.listaProfesores.add(new ProfesorTitular(nombre, apellido, codigoProfesor, especialidad));
            this.altaCorrecta("Profesor", apellido);
        }else{
            this.altaIncorrecta("Profesor", apellido);

        }
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

        if (!this.isAlumno(codigoAlumno)){
            this.listaAlumnos.add(new Alumno(nombre, apellido, codigoAlumno));
            this.altaCorrecta("Alumno", apellido);
        }else{
            this.altaIncorrecta("Alumno", apellido);
        }
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
                System.out.println("No se pudo inscribir al Alumno " + alumno.getNombre() + " en el curso " + curso.getNombre());
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

    private Boolean isCurso(Integer codigoCurso){
        for (Curso curso: this.listaCursos) {
            if (curso.equals(codigoCurso)){
                return true;
            }
        }
        return false;
    }

    private Alumno buscarAlumno(Integer codigoAlumno){
        for (Alumno alumno: this.listaAlumnos) {
            if (alumno.getCodigoAlumno().equals(codigoAlumno)){
                return alumno;
            }
        }
        return null;
    }

    private Boolean isAlumno(Integer codigoAlumno){
        for (Alumno alumno: this.listaAlumnos) {
            if (alumno.getCodigoAlumno().equals(codigoAlumno)){
                return true;
            }
        }
        return false;
    }

    private ProfesorTitular buscarProfesorTitular(Integer codigoProfesor){
        for (Profesor profesorTitular: this.listaProfesores)
            if (profesorTitular.equals(codigoProfesor)) {
                return (ProfesorTitular) profesorTitular;
            }
        return null;
    }

    private Boolean isProfesorTitular(Integer codigoProfesor){
        for (Profesor profesorTitular: this.listaProfesores)
            if (profesorTitular.getCodigoDeProfesor().equals(codigoProfesor)) {
                return true;
            }
        return false;
    }

    private ProfesorAdjunto buscarProfesorAdjunto(Integer codigoProfesor){
        for (Profesor profesorAdjunto: this.listaProfesores)
            if (profesorAdjunto.equals(codigoProfesor)) {
                return (ProfesorAdjunto) profesorAdjunto;
            }
        return null;
    }

    private Boolean isProfesorAdjunto(Integer codigoProfesor){
        for (Profesor profesorAdjunto: this.listaProfesores)
            if (profesorAdjunto.getCodigoDeProfesor().equals(codigoProfesor)) {
                return true;
            }
        return false;
    }


    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto){

        Curso curso = null;

        try {
            curso = this.buscarCurso(codigoCurso);
            curso.setProfesorTitular(this.buscarProfesorTitular(codigoProfesorTitular));
            curso.setProfesorAdjunto(this.buscarProfesorAdjunto(codigoProfesorAdjunto));

        }catch (Exception e){
            System.out.println("No se pudo asigar el profesor al curso " + codigoCurso );

        }

    }

    public void imprimirListadoDeCursosDeListadoDeAlumnos(){
        for (Alumno alumno: this.listaAlumnos) {

            alumno.imprimirListadoCursos();

        }
    }







}
