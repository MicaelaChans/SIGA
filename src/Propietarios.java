import java.util.Scanner;

public class Propietarios extends Clientes {
	
	private String direccion;
	public Propietarios(String nombre, String apellido, int documento, char correo, int telefono, String tipo, int id) {
		//super(nombre, apellido, documento, correo, telefono, tipo, id);
		//No funciona, no reconoce
		setDireccion(direccion);
	}
	/*
	public void MostrarPropietarios() {
		Scanner teclado = new Scanner(System.in);
		PropAlquiler alquiler =new PropAlquiler();
		PropVentas ventas =new PropVentas();
		InmobiliariaMartinez mostrarMenu = new InmobiliariaMartinez ();
		IngresosProp ingresos = new  IngresosProp();
		ModificarProp modificar = new ModificarProp();
		Salir sale = new Salir();
		System.out.println("Usted ingreso a la clase Propietarios");
		System.out.println("Por Favor Ingrese una Opcion");
		
		System.out.println("1- Alquier ");
		System.out.println("2- Ventas ");
		System.out.println("3- Ingresos ");
		System.out.println("4- Modificar ");
		System.out.println("5- Volver ");
		System.out.println("0- Salir ");		
		
		int menuPropietarios= teclado.nextInt();
		
		switch(menuPropietarios) {
		case 1: alquiler.AlquilerProp();
			break;
		case 2:ventas.VentasProp();
			break;
		case 3:ingresos.PropIngresos();
			break;
		case 4:modificar.ModificarPropiedades();
			break;
		case 5:mostrarMenu.main(null);
			break;
		case 0:sale.MostrarSalir();
			break;
		default: System.out.println("Ingrese una Opcion Valida");	
	 
	}
		
	}*/

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String toString() {
		return "Nombre: " + getNombre() + 
				" Apellido: " + getApellido() + 
				" Documento: " + getDocumento() + 
				" Correo: " + getCorreo() +
				" Telefono: " + getTelefono() +
				" Tipo: " + getTipo() +
				" Direccion" + getDireccion() +
				" Id: " + getId(); 
	}

}
