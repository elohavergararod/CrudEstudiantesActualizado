package gestión;

import estudiantes.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class Listado {
    private static List<Estudiante> estudiantes = new ArrayList<>();

    public static List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public static void listarEstudiantes(List<Estudiante> estudiantes) {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        System.out.println("id\tnombre completo\tasignatura 1 (nota)\tasignatura 2 (nota)");
        for (Estudiante a : estudiantes) {
            System.out.println(a);
        }
    }
}
