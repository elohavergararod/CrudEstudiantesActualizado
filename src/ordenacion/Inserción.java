package ordenacion;

import estudiantes.Estudiante;

import java.util.List;

public class Inserción {
    public static void insercion(List<Estudiante> estudiantes) {
        for (int i = 1; i < estudiantes.size(); i++) {
            Estudiante key = estudiantes.get(i);
            int j = i - 1;
            while (j >= 0 && estudiantes.get(j).getNombre().compareToIgnoreCase(key.getNombre()) > 0) {
                estudiantes.set(j + 1, estudiantes.get(j));
                j--;
            }
            estudiantes.set(j + 1, key);
        }
    }
}
