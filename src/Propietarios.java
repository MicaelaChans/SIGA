import java.util.Scanner;

public class Propietarios /*extends Clientes */{
	
	private String direccion;
	/*public Propietarios(String nombre, String apellido, int documento, char correo, int telefono, String tipo, int id) {
		//super(nombre, apellido, documento, correo, telefono, tipo, id);
		//No funciona, no reconoce
		setDireccion(direccion);
	}*/
	
	public void MostrarPropietarios() {
		Scanner teclado = new Scanner(System.in);
		InmobiliariaMartinez mostrarMenu = new InmobiliariaMartinez ();
		ModificarProp modificar = new ModificarProp();
		Salir sale = new Salir();
		
		System.out.println("Usted ingreso a la clase Propietarios");
		System.out.println("Por Favor Ingrese una Opcion");
		
		System.out.println("1- Agregar propietarios ");
		System.out.println("4- Modificar propietarios ");
		System.out.println("4- Listar propietarios ");
		System.out.println("4- Borrar propietarios ");
		System.out.println("5- Volver ");
		System.out.println("0- Salir ");		
		
		int menuPropietarios= teclado.nextInt();
		
		switch(menuPropietarios) {
		case 1: ;
			break;
		case 2: ;
			break;
		case 3: ;
			break;
		case 4:modificar.ModificarPropiedades();
			break;
		case 5:mostrarMenu.main(null);
			break;
		case 0:sale.MostrarSalir();
			break;
		default: System.out.println("Ingrese una Opcion Valida");	
	 
	}
		
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/*
	public String toString() {
		return "Nombre: " + getNombre() + 
				" Apellido: " + getApellido() + 
				" Documento: " + getDocumento() + 
				" Correo: " + getCorreo() +
				" Telefono: " + getTelefono() +
				" Tipo: " + getTipo() +
				" Direccion" + getDireccion() +
				" Id: " + getId(); 
	}*/

}
