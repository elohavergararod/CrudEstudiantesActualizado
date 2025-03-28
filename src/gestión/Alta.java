package gestión;

import estudiantes.Estudiante;
import input.Input;
import output.Output;

public class Alta {
    private static Output output = new Output();
    private static Input input = new Input();

    public void agregarEstudiante(){
        for (int i = 0; i < 2; i++){
            output.mostrarMensaje("Escriba el id del estudiante: ");
            int id = input.obtenerEntero();
            output.mostrarMensaje("Escriba el nombre completo del estudiante: ");
            String nombreCompleto = input.obtenerTexto();
            output.mostrarMensaje("Escriba la edad del estudiante: ");
            int edad = input.obtenerEntero();
            output.mostrarMensaje("Escriba la primera asignatura: ");
            String asignatura1 = input.obtenerTexto();
            output.mostrarMensaje("Escriba la nota de la primera asignatura: ");
            int nota1 = input.obtenerEntero();
            output.mostrarMensaje("Escriba la segunda asignatura: ");
            String asignatura2= input.obtenerTexto();
            output.mostrarMensaje("Escriba la nota de la segunda asignatura: ");
            int nota2 = input.obtenerEntero();
            Listado.getEstudiantes().add(new Estudiante(id, nombreCompleto, edad, asignatura1, nota1, asignatura2, nota2));
        }
    }


}
