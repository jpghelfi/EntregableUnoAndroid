package com.company;

public class ProfesorTitular extends Profesor {

    protected String especialidad;

    public ProfesorTitular(String nombre, String apellido, Integer codigoDeProfesor, String especialidad) {
        super(nombre, apellido, codigoDeProfesor);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public boolean equals(Inscripcion codigo) {

        return codigo.equals(this.codigoDeProfesor);
    }
}
