package gestión;

import estudiantes.Estudiante;
import input.Input;
import output.Output;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Baja {
    private static Output output = new Output();
    private static Input input = new Input();
    private List<Estudiante> estudiantes = new ArrayList<>();

    public void eliminarEstudiante() {
        output.mostrarMensaje("Ingrese el ID del alumno a eliminar:");
        int id = input.obtenerEntero();

        boolean found = false;
        Iterator<Estudiante> iter = Listado.getEstudiantes().iterator();
        while (iter.hasNext()) {
            if (iter.next().getId() == id) {
                iter.remove();
                found = true;
                output.mostrarMensaje("Estudiante eliminado correctamente.");
                break;
            }
        }
        if (!found) {
            output.mostrarMensaje("Alumno no encontrado.");
        }
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
