package estudiantes;

public class Estudiante {
    int id;
    String nombreCompleto;
    int edad;
    String asignatura1;
    int nota1;
    String asignatura2;
    int nota2;

    public Estudiante(int id, String nombreCompleto, int edad, String asignatura1, int nota1, String asignatura2, int nota2) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.asignatura1 = asignatura1;
        this.nota1 = nota1;
        this.asignatura2 = asignatura2;
        this.nota2 = nota2;
    }
    public int getId() {
        return id;
    }
    public void setNota1(int nota) {
        this.nota1 = nota;
    }
    public String getNombre() {
        return nombreCompleto;
    }


    @Override
    public String toString() {
        return id + "\t" + nombreCompleto + "\t" + asignatura1 + " (" + nota1 + ")\t" + asignatura2 + " (" + nota2 + ")";
    }

}
