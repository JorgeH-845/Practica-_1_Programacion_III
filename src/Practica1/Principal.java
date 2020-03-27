package Practica1;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		Lista ListaProyecto= new Lista();
		int opcion=0;
		String Nombrenew="";
        String Placanew="";	 	
		do {
			System.out.println("<<--------------------------------->>");
			System.out.println("");
			System.out.println("BIENVENIDO AL PROGRAMA DEL PARQUEO");
			System.out.println("");
			System.out.println("     MENÚ PRINCIPAL.       ");
            System.out.println(">> 1.Registro de clientes.     <<");
			System.out.println(">> 2.Salida de clientes.       <<");
			System.out.println(">> 3.Visualización de parqueo. <<");
			System.out.println(">> 4.Búsqueda de cliente.      <<");
			System.out.println("");
			System.out.println("<<--------------------------------->>");
			opcion=entrada.nextInt();
			
			switch(opcion) {
			  case 1:
			  int op=0;
			  do {
              System.out.println("Ingrese un nuevo cliente");
              System.out.println("Ingrese el nombre");
              String Nombre=entrada.next();
              System.out.println("Ingrese el NIT");
              int Nit=entrada.nextInt();
              System.out.println("Ingrese la fecha de nacimiento");
              int FechaNacimiento=entrada.nextInt();
              System.out.println("Ingrese el Teléfono");
              int Telefono=entrada.nextInt();
              System.out.println("Ingrese la hora de entrada del cliente");
              int HoraEntrada=entrada.nextInt();
              System.out.println("Ingrese la placa");
              String NoPlaca=entrada.next();
              System.out.println("Ingrese el tipo de Vehículo");
              String TipoVehiculo=entrada.next();
              System.out.println("Ingrese el Color del Vehículo");
              String ColorVehiculo =entrada.next();
              int edad=2020-FechaNacimiento;
              Cliente nuevoCliente= new Cliente(Nombre, Nit, FechaNacimiento, Telefono, HoraEntrada, NoPlaca, TipoVehiculo, ColorVehiculo);
             if(edad<=50) {
              ListaProyecto.agregarNodoFIFO(nuevoCliente); 
              System.out.println("El cliente ha sido agregado al final del parqueo");
             }else {
            
             
            	 ListaProyecto.agregarNodoLIFO(nuevoCliente);
            	 System.out.println("El cliente ha sido agregado al inicio del parqueo");
             }
             
              System.out.println("¿Desea ingresar otro cliente? 1.Si  2.No");
              op=entrada.nextInt();
			  }while(op==1);
             
				break;
				
			  case 2:
				   System.out.println("Ingrese la placa del cliente que saldrá del parqueo");
				    Placanew=entrada.next();
				   
				   ListaProyecto.salidaCliente(Placanew);
				   ListaProyecto.eliminarCliente(Placanew);
					
					
				   
				   System.out.println("¿Desea volver al menú principal?  1.Si  2.No");
				   opcion=entrada.nextInt();
				  break;
			  
			  case 3:
				  ListaProyecto.imprimirLista();
				  System.out.println("¿Desea volver al menú principal?  1.Si  2.No");
				   opcion=entrada.nextInt();
				  break;
			  
			  case 4:
				  System.out.println("Ingrese el nombre del cliente que desea buscar");
				    Nombrenew=entrada.next();
				   System.out.println("Ingrese la placa del vehículo");
				    Placanew=entrada.next();
				   ListaProyecto.buscarCliente(Nombrenew, Placanew);
				   System.out.println("¿Desea volver al menú principal?  1.Si  2.No");
				   opcion=entrada.nextInt();
				  break;
			      default:
					break;
			}
		}while(opcion!=4);
	}
	 
	

}
