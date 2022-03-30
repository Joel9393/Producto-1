
package main.java.grupofp.vista;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import main.java.grupofp.controlador.Controlador;



public class OnlineStore {  
    
    public static void main(String[] args) throws Exception{
    	
    Controlador controlador = new Controlador();
    GestionOS gestionOS = new GestionOS();
    
    boolean salir = false;
    char opcion;
    do {
        System.out.println("");
        System.out.println("1. Cargar Datos");
        System.out.println("2. Mostrar datos");
        System.out.println("0. Salir de la aplicación");
        opcion = pedirOpcion();
        switch (opcion) {
            case '1':
                gestionOS.cargaDeDatos(controlador);
                break;
            case '2':
                gestionOS.mostrarDatos(controlador);
                break;
            case '0':
                salir = true;
                
        }
    } while (!salir);

    }


static char pedirOpcion() {
    String resp;
    System.out.print("Elige una opción (1,2 o 0): ");
    Scanner teclado = new Scanner(System.in);
	resp = teclado.nextLine();
    if (resp.isEmpty()) {
        resp = " ";
    }
    return resp.charAt(0);
}

}