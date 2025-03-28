package App;

import Gestión.*;
import Input.Input;
import Output.Output;

public class App {
    public static void main(String[] args) {
        Output output = new Output();
        Input input = new Input();
        Alta alta =  new Alta();
        Baja baja = new Baja();
        Modificacion modificacion = new Modificacion();
        Listado listado = new Listado();

        int opcionEscogida;

        do{
            output.mostrarMenu();
            output.mostrarMensaje("Escoge una opción: ");
            opcionEscogida= input.obtenerEntero();

            switch (opcionEscogida){
                case 1:
                    alta.agregarEstudiante();
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
                    listado.listarEstudiantes(listado.getEstudiantes());
                    break;
                case 5:
                    break;
                default:
                    System.out.println("No es una opción válida, vuela a intentarlo.\n");
            }
        }while(opcionEscogida != 5);

    }
}