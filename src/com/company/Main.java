package com.company;

public class Main {

//      6. Inscribir a dos alumnos en el curso de Full Stack.
//      7. Inscribir a dos alumnos en el curso de Android.
//      8. Inscribir a tres alumnos en el curso de Android.

    public static void main(String[] args) throws DHException, OtherException {


        DigitalHouseManager manager = new DigitalHouseManager();

//        manager.altaAlumno("Huguito","Moyano",1);
//        manager.altaAlumno("Huguito","Moyano",1);
////        manager.altaAlumno("Huguito","Moyano",1);
//        manager.altaAlumno("Huguito","Moyano",1);
//        manager.altaAlumno("Caballo", "Suarez", 2);
//        manager.altaAlumno("Hugo", "Barrionuevo", 3);

        manager.altaProfesorTitular("Pepe","Venegas",1, "Economia");
//        manager.altaProfesorTitular("Pepe","Venegas",1, "Economia");
//        manager.altaProfesorTitular("Lalo","Lorenzetti",2, "Historia");
//
        manager.altaProfesorAdjunto("Juan Pablo", "Ghelfi",3,4);
//        manager.altaProfesorAdjunto("Juan Pablo", "Ghelfi",3,4);
//        manager.altaProfesorAdjunto("Fernando", "Alonso",4,5);
//
//
        manager.altaCurso("Full Stack",20001, 5);
//        manager.altaCurso("Full Stack",20001, 5);
//        manager.altaCurso("Android",20002, 2);
//
        manager.asignarProfesores(20001,1, 3);
        manager.asignarProfesores(20001,1, 3);
//        manager.asignarProfesores(20002,3, 4);
//
        manager.inscribirAlumno(1,20001);
//        manager.inscribirAlumno(2,20001);
//        manager.inscribirAlumno(2,20001);

//        manager.inscribirAlumno(3,20002);
//        manager.inscribirAlumno(1,20002);
//        manager.inscribirAlumno(2,20002);

        manager.imprimirListadoDeCursosDeListadoDeAlumnos();

        Alumno unAlumno = new Alumno("Juancno","Ghelfi",9);

        try {
            DigitalException.inscripcionDH(unAlumno);

        }catch (DHException e){
            System.out.println("Venir al colearning");
        }catch (OtherException e){
            System.out.println("Hablar con alumnos");

        }





    }
}
