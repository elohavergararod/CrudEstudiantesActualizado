package output;

public class Output {
    public void mostrarMenu(){
        System.out.println("\nMENU App Crud de Estudiantes");
        System.out.println("-----------------------------");
        System.out.println("1. Alta");
        System.out.println("2. Baja");
        System.out.println("3. Modificación de la primera nota");
        System.out.println("4. Listado");
        System.out.println("5. Busqueda de Alumno");
        System.out.println("6. Salir");
    }
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }


}
