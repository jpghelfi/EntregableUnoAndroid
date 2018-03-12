package com.company;

public class ProfesorAdjunto extends Profesor{

    protected Integer horasParaConsultas;

    public ProfesorAdjunto(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor, Integer horasParaConsultas) {
        super(nombre, apellido, antiguedad, codigoDeProfesor);
        this.horasParaConsultas = horasParaConsultas;
    }

    public Integer getHorasParaConsultas() {
        return horasParaConsultas;
    }
}
