package Gestión;

import Estudiantes.Estudiante;
import Input.Input;
import Output.Output;

import java.util.ArrayList;
import java.util.List;


public class Modificacion {
    private static Output output = new Output();
    private static Input input = new Input();

    public void modificarNota1() {
        output.mostrarMensaje("Ingrese el ID del alumno al que quiere modificar la nota de la primera asignatura:");
        int id = input.obtenerEntero();
        output.mostrarMensaje("Ingrese la nueva nota:");
        int nuevaNota = input.obtenerEntero();

        for (Estudiante e : Listado.getEstudiantes()) {
            if (e.getId() == id) {
                e.setNota1(nuevaNota);
                output.mostrarMensaje("Nota actualizada correctamente.");
                return;
            }
        }
        output.mostrarMensaje("Alumno no encontrado.");
    }


}
