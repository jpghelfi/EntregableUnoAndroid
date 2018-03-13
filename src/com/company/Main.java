package com.company;

public class Main {

//      6. Inscribir a dos alumnos en el curso de Full Stack.
//      7. Inscribir a dos alumnos en el curso de Android.
//      8. Inscribir a tres alumnos en el curso de Android.

    public static void main(String[] args) {


        Alumno alumnoUno = new Alumno("Hugo","Moyano",6556);
        Alumno alumnoDos = new Alumno("Caballo", "Suarez", 9998);
        Alumno alumnoTres = new Alumno("Hugo", "Barrionuevo", 234);

        DigitalHouseManager manager = new DigitalHouseManager();

        manager.altaAlumno("Hugo","Moyano",6556);
        manager.altaAlumno("Caballo", "Suarez", 9998);
        manager.altaAlumno("Hugo", "Barrionuevo", 234);

        manager.altaProfesorTitular("Pepe","Suarez",3, "Economia");
        manager.altaProfesorTitular("Lalo","Lorenzetti",4, "Historia");

        manager.altaProfesorAdjunto("Juan", "Ghelfi",1,4);
        manager.altaProfesorAdjunto("Pablo", "Perez",2,5);


        manager.altaCurso("Full Stack",20001, 3);
        manager.altaCurso("Android",20002, 2);

        manager.asignarProfesores(20001,3, 1);
        manager.asignarProfesores(20002,4, 2);

        manager.inscribirAlumno(6556,20001);
        manager.inscribirAlumno(9998,20001);

        manager.inscribirAlumno(234,20002);
        manager.inscribirAlumno(9998,20002);
        manager.inscribirAlumno(6556,20002);




    }
}
