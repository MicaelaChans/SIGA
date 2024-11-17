import java.util.Scanner;

public class Propietario extends Cliente {
		public Propietario(int id, int documento, String nombre, String apellido, int telefono) {
			super(id, documento, nombre, apellido, telefono);
		   }

		public void Propietarios() {
			//Scanner teclado = new Scanner(System.in);
			System.out.println("Usted ingreso al menu Propietarios");		
			//int propietarios = teclado.nextInt();
		}

		public String toString() {
			int num=0;
			num = 5 - String.valueOf(getId()).length();
			return  " Id: " + getId() + ", "+
					" Nombre: " + getNombre() + ", " +
					" Apellido: " + getApellido() + ", " +
					" Documento: " + getDocumento() + ", " +
					" Telefono: " + getTelefono() + ", ";				  
	}
}
