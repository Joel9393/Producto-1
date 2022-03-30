
package main.java.grupofp.vista;

import main.java.grupofp.controlador.Controlador;

/**
 *
 * @author joelj
 */
public class GestionOS {
    
	static void cargaDeDatos(Controlador controlador)throws Exception{
		controlador.getDatos().getClientes().aniadir("Raist", "86457384H", "Madrid", "RaistEclypse@gmail.com", "Premium");
		controlador.getDatos().getClientes().aniadir("Carlos", "89641738I", "Barcelona", "carlitos.1@gmail.com", "Premium");
		controlador.getDatos().getClientes().aniadir("Maria", "76489372F", "Murcia", "mariantonia@gmail.com", "Estandard");
		controlador.getDatos().getArticulos().aniadir("1","Mechero",2,1,0.5);
		controlador.getDatos().getArticulos().aniadir("2","Tijeras",15,2,1);
		controlador.getDatos().getPedidos().aniadir(1, 3, null, null, "1", "76489372F");
		controlador.getDatos().getPedidos().aniadir(2, 1, null, null, "2", "86457384H");
	}

	static void mostrarDatos(Controlador controlador) {
		System.out.println(controlador.getDatos().getClientes().toString());
		System.out.println(controlador.getDatos().getArticulos().toString());
		System.out.println(controlador.getDatos().getPedidos().toString());
	}
}
