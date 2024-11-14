import java.util.Scanner;

public class Propietario extends Cliente {
		public Propietario(int id, int documento, String nombre, String apellido, int telefono, String tipo, boolean confirmar) {
			super(id, documento, nombre, apellido, telefono, tipo, confirmar);
		   }

		public void Propietarios() {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Usted ingreso al menu Propietarios");		
			int propietarios = teclado.nextInt();
		}

		public String toString() {
			return  " Nombre: " + getNombre() + ", " +
					" Apellido: " + getApellido() + ", " +
					" Documento: " + getDocumento() + ", " +
					" Telefono: " + getTelefono() +", " +
					" Confirmar: " + isConfirmar() + ", " +
					" Id: " + getId() + ", ";  
	}
}
