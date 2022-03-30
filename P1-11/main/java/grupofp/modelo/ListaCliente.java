/**
 * 
 */
package main.java.grupofp.modelo;

import java.util.Iterator;

public class ListaCliente extends Lista<Cliente>{


		public void aniadir(String nombre, String nif,String domicilio, String email, String tipoCliente) throws Exception {
	    	ClienteEstandard clienteEstandard = null;
	    	ClientePremium clientePremium = null;
	    	
	    	if (tipoCliente == "Estandard") {
	    		 clienteEstandard = new ClienteEstandard( nombre,  nif, domicilio, email);
	    		
	    	}
	    	else if (tipoCliente == "Premium") {
	    		 clientePremium = new ClientePremium(nombre, nif, domicilio, email);
	    	}
	    	if (clienteEstandard != null ) {
	    		if (esCliente(clienteEstandard.getNif())) {
			 		throw new Exception ("Ya es Cliente");
			 	}
			 	else {
			 		lista.add(clienteEstandard);
			 	}
	    	} else if (clientePremium != null) {
		 	if (esCliente(clientePremium.getNif())) {
		 		throw new Exception ("Ya es Cliente");
		 	}
		 	else {
		 		lista.add(clientePremium);
		 	}
	    	}
	 }
	 	public boolean esCliente(String nif) {
	 		for (Cliente cliente: lista) {
	 			if (cliente.getNif().equals(nif)) {
	 				return true;
	 			}
	 		}
	 		return false;
	 	}
	 	
	 	@Override
	 	public int search (String pk) throws Exception {
	 		int posicion = 0;
	 		for (Cliente cliente: lista) {
	 			if (cliente.getNif().equals(pk)){
	 				return posicion;
	 				
	 			}
	 			posicion++;
	 		}
	 		throw new Exception("Este cliente no existe");
	 	}
	 	
        @Override
    public String toString() {
        String cadena = "";
       for (Cliente cliente: lista) {
    	   cadena+=(cliente.toString())+"\n";
    	  
       }return cadena;
    }
} 