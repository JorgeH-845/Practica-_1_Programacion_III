package Practica1;

import java.util.Scanner;


public class Lista {

	public Nodo inicio = null;
	public int tamanio = 0;
	Scanner entrada = new Scanner(System.in);
	
	public boolean isvacia() {
		return tamanio == 0; 
	}
	
	public void agregarNodoFIFO(Cliente informacionCliente) {
		Nodo nodotmp = new Nodo (informacionCliente, null);
		
		if(isvacia()) {
			inicio = nodotmp;	
		}else {
			Nodo nodotmp2 = inicio;
			while(nodotmp2.siguiente!=null) {
				nodotmp2 = nodotmp2.siguiente;
			}
			nodotmp2.siguiente = nodotmp;
		}
		tamanio++;
		if (tamanio<=100) {
			int parqueo=100-tamanio;
			System.out.println("");
			System.out.println("Parqueos Disponibles"  + parqueo +    "de 100");
			System.out.println(""); 
		}
	}
	
	public void agregarNodoLIFO(Cliente informacionCliente) {
		Nodo nodotmp = new Nodo(informacionCliente, null);
		
		if(isvacia()){
			inicio = nodotmp;
		}else{
			nodotmp.siguiente = inicio;
			inicio = nodotmp;
		}
		tamanio++;
		if (tamanio<=100) {
			int parqueo=100-tamanio;
			System.out.println("");
			System.out.println("Parqueos Disponibles"  + parqueo +   "de 100");
			System.out.println("");
		}
	} 
	
	public void imprimirLista() {
		Nodo nodotmp = inicio;
		System.out.println("");
		System.out.println("");
		System.out.println("|-------- IMPRESIÓN DE DATOS------|");
		System.out.println("| Nombre: " + nodotmp.informacionNodo.Nombre  + "| NIT: "  + nodotmp.informacionNodo.Nit + "| Fecha de nacimiento: "  + nodotmp.informacionNodo.FechaNacimiento + " | Teléfono: " + nodotmp.informacionNodo.Telefono + "| Hora de entrada: " + nodotmp.informacionNodo.HoraEntrada + "| Número de Placa:" + nodotmp.informacionNodo.NoPlaca + "| Tipo de Vehículo: " + nodotmp.informacionNodo.TipoVehiculo + "| Color del Vehículo: " + nodotmp.informacionNodo.ColorVehiculo);
		while (nodotmp.siguiente != null) { 
			nodotmp = nodotmp.siguiente;
			System.out.println("| Nombre: " + nodotmp.informacionNodo.Nombre   + "| NIT: "  + nodotmp.informacionNodo.Nit + "| Fecha de nacimiento: "  + nodotmp.informacionNodo.FechaNacimiento + " | Teléfono: " + nodotmp.informacionNodo.Telefono + "| Hora de entrada: " + nodotmp.informacionNodo.HoraEntrada + "| Numero de Placa:" + nodotmp.informacionNodo.NoPlaca + "| Tipo de Vehículo: " + nodotmp.informacionNodo.TipoVehiculo + "| Color del Vehículo: " + nodotmp.informacionNodo.ColorVehiculo);
            
		} 
 
	}   
	
	public void buscarCliente(String Nombrenew, String NoPlacanew) {
		Nodo nodotmp = inicio; 
		int contador = 0;
		boolean encontrado = false; 
		while (nodotmp.siguiente != null) { 
			

			if (nodotmp.informacionNodo.Nombre.contains(Nombrenew) || nodotmp.informacionNodo.NoPlaca.contains(NoPlacanew) ) {
				System.out.println("se encontró el cliente en el indice:" + contador);
				encontrado = true;
				
			}

			nodotmp = nodotmp.siguiente;
			contador++;
		}

		if (!encontrado) {
			System.out.println("Cliente no encontrado");
		}
	}
	
	public void salidaCliente(String NoPlacanew) {
		Scanner entrada= new Scanner(System.in); 
		Lista lista= new Lista();  
		Nodo nodotmp = inicio;
		int contador = 0;
		boolean encontrado = false;
		while (nodotmp.siguiente != null) {
			if (nodotmp.informacionNodo.NoPlaca.contains(NoPlacanew)  ) { 
				System.out.println("se encontró el Cliente ");
				System.out.println("");
				System.out.println("----->> Datos del Cliente encontrado:");
				System.out.println("----->> Nombre: " + nodotmp.informacionNodo.Nombre);
				System.out.println("----->> NIT: " + nodotmp.informacionNodo.Nit);
				System.out.println("----->> Fecha de Nacimiento: " + nodotmp.informacionNodo.FechaNacimiento);
				System.out.println("----->> Telefono: " + nodotmp.informacionNodo.Telefono);
				System.out.println("----->> Hora de Entrada: " + nodotmp.informacionNodo.HoraEntrada);
				System.out.println("----->> Placa: " + nodotmp.informacionNodo.NoPlaca);
				System.out.println("----->> Tipo de Vehículo: " + nodotmp.informacionNodo.TipoVehiculo);
				System.out.println("----->> Color de Vehículo: " + nodotmp.informacionNodo.ColorVehiculo);
				System.out.println("");
				System.out.println("Ingrese la hora de salida del cliente");
				int horaSalida= entrada.nextInt();
				int total=(horaSalida-nodotmp.informacionNodo.HoraEntrada) * (15);
				System.out.println("");
				System.out.println("El total a pagar es de: Q"  + total); 
				System.out.println("");
				System.out.println("Ingrese el efectivo a pagar");
				double efectivo= entrada.nextDouble(); 
				double cambio= efectivo-total; 
				System.out.println("Su cambio es de: Q"  + cambio);
				System.out.println("");
				encontrado = true;
				System.out.println("La salida del cliente ha sido exitosa");
				System.out.println("");
				System.out.println("El cliente ha sido eliminado");
			}

			nodotmp = nodotmp.siguiente;
			contador++;
		}

		if (!encontrado) {
			System.out.println("");
			System.out.println("No se encontro el cliente");
		}
	}
	

	
	
public void eliminarCliente(String NoPlacanew) {
		
		Nodo nodotmp = inicio;
		Nodo nodoAnterior= null;
		int contador = 0;
		boolean encontrado = false;
		while(nodotmp.siguiente!=null) {
		if (nodotmp.informacionNodo.NoPlaca.contains(NoPlacanew)) {
			System.out.println("se encontró el cliente en el indice:" + contador);
			if(contador==0) {
				Nodo eliminado=null;
				eliminado=inicio;
				inicio= inicio.siguiente;
				eliminado.siguiente=null;
				encontrado=true;
				break;
			}else {
				nodoAnterior.siguiente=nodotmp.siguiente;
				encontrado=true;
				break;
			}
			
			
		}

		

		nodoAnterior= nodotmp;
		nodotmp=nodotmp.siguiente;
		
		contador++;
	}

	if (!encontrado) {
		System.out.println("El Cliente no ha sido encontrado");
	}
  }
	
	
}
