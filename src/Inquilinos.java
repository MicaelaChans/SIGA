import java.util.Scanner;

public class Inquilinos extends Clientes {
	public Inquilinos(String nombre, String apellido, int documento, char correo, int telefono, String tipo, int id) {
		super(id, documento, nombre, apellido, correo, telefono, tipo);
	}

	public void MostrarInquilinos () {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Usted ingresó a la Opción Inquilinos");		
		System.out.println("Ingrese 1 Para Mostrar las Propiedades/0 Para Volver al Menu");
		int inquilinos = teclado.nextInt();
		InmobiliariaMartinez identificadorMostrarMenu = new InmobiliariaMartinez ();
		
		if (inquilinos ==1) {
			System.out.println("HOla");
		}else if (inquilinos==0){
			identificadorMostrarMenu.main(null);
		}
		//teclado.close();
	}
	
	public String toString() {
		return "Nombre: " + getNombre() + 
				" Apellido: " + getApellido() + 
				" Documento: " + getDocumento() + 
				" Correo: " + getCorreo() +
				" Telefono: " + getTelefono() +
				" Tipo: " + getTipo() +
				" Id: " + getId(); 
	}

}
