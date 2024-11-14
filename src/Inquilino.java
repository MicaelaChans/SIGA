import java.util.Scanner;

public class Inquilino extends Cliente {
   public Inquilino(int id, int documento, int telefono, String nombre, String apellido, String tipo, boolean confirmar) {
	super(id, documento, nombre, apellido, telefono, tipo, confirmar);
   }

public void Inquilinos() {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Usted ingreso al menu Inquilino");		
	int inquilinos = teclado.nextInt();
}

public String toString() {
	return  " Nombre: " + getNombre() + ", " +
			" Apellido: " + getApellido() + ", " +
			" Documento: " + getDocumento() + ", " +
			" Telefono: " + getTelefono() +", " +
			" Tipo: " + getTipo() + ", " +
			" Id: " + getId() + ", ";  
	}
}
