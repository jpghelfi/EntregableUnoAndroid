package com.company;



public class ProfesorAdjunto extends Profesor{

    protected Integer horasParaConsultas;

    public ProfesorAdjunto(String nombre, String apellido, Integer codigoDeProfesor, Integer horasParaConsultas) {
        super(nombre, apellido, codigoDeProfesor);
        this.horasParaConsultas = horasParaConsultas;
    }

    public Integer getHorasParaConsultas() {
        return horasParaConsultas;
    }

    public boolean equals(Inscripcion codigo) {

        return codigo.equals(this.codigoDeProfesor);
    }
}
