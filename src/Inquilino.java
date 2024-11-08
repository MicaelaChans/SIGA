import java.util.Scanner;

public class Inquilino extends Cliente {
   public Inquilino(String nombre, String apellido, int documento, char correo, int telefono, String tipo, int id) {
	super(id, documento, nombre, apellido, correo, telefono, tipo);
   }

public void Inquilinos() {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Usted ingresó a la Opción Inquilinos");		
	int inquilinos = teclado.nextInt();
	
	
	
	
}

public String toString() {
	return  " Nombre: " + getNombre() + 
			" Apellido: " + getApellido() + 
			" Documento: " + getDocumento() + 
			" Correo: " + getCorreo() +
			" Telefono: " + getTelefono() +
			" Tipo: " + getTipo() +
			" Id: " + getId(); 
}
	
	
	
	
	
	
	
	
}
