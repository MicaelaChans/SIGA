import java.util.Scanner;
import java.util.ArrayList;
public class Propietarios /*extends Clientes */{
	
	private String direccion;
	private static ArrayList<Propietarios>Propietarios = new ArrayList<>();
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
	
	public void crearPropietario() {
		int id = 0, documento = 0, telefono = 0,tmp = 0;
		String nombre = " ", apellido = " ", tipo = " ", tmp1 = "";
		char correo = ' ', tmp2 = ' ';
		
		Scanner teclado = new Scanner (System.in);
		tmp = teclado.nextInt();
		tmp1 = teclado.nextLine();
		tmp2 = teclado.next().charAt(0);

		System.out.println("Ingrese el nombre: ");
        tmp1 = nombre;
        System.out.println("Ingrese el apellido: ");
		tmp1 = apellido;
		System.out.println("Ingrese el documento: ");
		tmp = documento;
		System.out.println("Ingrese el correo: ");
		tmp2 = correo;
		System.out.println("Ingrese el telefono: ");
		tmp =  telefono;
		System.out.println("Ingrese el id: ");
        tmp = id;
        System.out.println("Ingrese el tipo: ");
		tmp1 = tipo;
		
		Propietarios propietario = new Propietarios(nombre,apellido,tipo);
		Propietarios.add(propietario);
		
		
		
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

	public static ArrayList<Propietarios> getPropietarios() {
		return Propietarios;
	}

	public static void setPropietarios(ArrayList<Propietarios> propietarios) {
		Propietarios = propietarios;
	}

}
