package busquedaBinaria;

import estudiantes.Estudiante;

import java.util.List;


public class BusquedaBinaria {
    public static Estudiante buscar(List<Estudiante> estudiantes, String nombreBuscado) {
        int low = 0;
        int high = estudiantes.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            Estudiante midEstudiante = estudiantes.get(mid);
            int cmp = midEstudiante.getNombre().compareToIgnoreCase(nombreBuscado);
            if (cmp == 0) {
                return midEstudiante;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}
