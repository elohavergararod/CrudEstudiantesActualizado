package app;

import busquedaBinaria.BusquedaBinaria;
import estudiantes.Estudiante;
import gestión.*;
import input.Input;
import ordenacion.Inserción;
import output.Output;

import java.util.List;


public class App {
    public static void main(String[] args) {
        Output output = new Output();
        Input input = new Input();
        Alta alta =  new Alta();
        Baja baja = new Baja();
        Modificacion modificacion = new Modificacion();
        Listado listado = new Listado();
        List<Estudiante> estudiantes = listado.getEstudiantes();

        int opcionEscogida;

        do{
            output.mostrarMenu();
            output.mostrarMensaje("Escoge una opción: ");
            opcionEscogida= input.obtenerEntero();

            switch (opcionEscogida){
                case 1:
                    alta.agregarEstudiante();
                    Inserción.insercion(estudiantes);
                    break;
                case 2:
                    listado.listarEstudiantes(listado.getEstudiantes());
                    baja.eliminarEstudiante();
                    break;
                case 3:
                    listado.listarEstudiantes(listado.getEstudiantes());
                    modificacion.modificarNota1();
                    break;
                case 4:
                    listado.listarEstudiantes(estudiantes);
                    break;
                case 5:
                    output.mostrarMensaje("Escriba el nombre del alumno:");
                    String nombreAlumno = input.obtenerTexto();
                    Inserción.insercion(estudiantes);
                    System.out.println(BusquedaBinaria.buscar(estudiantes,nombreAlumno));;
                    break;
                case 6:
                    break;
                default:
                    System.out.println("No es una opción válida, vuela a intentarlo.\n");
            }
        }while(opcionEscogida != 6);
    }
}