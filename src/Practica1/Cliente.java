package Practica1;

public class Cliente {
	
	String Nombre = ""; 
	int Nit = 0;
	int FechaNacimiento = 0;
	int Telefono = 0;
	int HoraEntrada = 0;
	String NoPlaca = "";
	String TipoVehiculo = "";
	String ColorVehiculo = "";
	
	public Cliente(String Nombre, int Nit, int FechaNacimiento, int Telefono, int HoraEntrada, String NoPlaca, String TipoVehiculo, String ColorVehiculo) {
		this.Nombre=Nombre;
		this.Nit = Nit;
		this.FechaNacimiento = FechaNacimiento;
		this.Telefono = Telefono; 
		this.HoraEntrada = HoraEntrada;
		this.NoPlaca = NoPlaca;
		this.TipoVehiculo = TipoVehiculo;
		this.ColorVehiculo = ColorVehiculo;
	}
	
}
