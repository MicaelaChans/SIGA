import java.util.Scanner;

public class Inquilino extends Cliente {
   public Inquilino(int id, int documento, int telefono, String nombre, String apellido) {
	super(id, documento, nombre, apellido, telefono);
   }

public void Inquilinos() {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Usted ingreso al menu Inquilino");		
	int inquilinos = teclado.nextInt();
}

public String toString() {
	int num=0;
	num = 5 - String.valueOf(getId()).length();
	return  " Id: " + getId() + ", "+
			" Nombre: " + getNombre() + ", " +
			" Apellido: " + getApellido() + ", " +
			" Documento: " + getDocumento() + ", " +
			" Telefono: " + getTelefono() +", ";  
	}
}
