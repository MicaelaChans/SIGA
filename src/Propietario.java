
public class Propietario extends Cliente {
		public Propietario(int id, int documento, String nombre, String apellido, int telefono) {
			super(id, documento, nombre, apellido, telefono);
		   }

		public void Propietarios() {
			System.out.println("Usted ingreso al menu Propietarios");		
		}

		public String toString() {
			int num=0;
			num = 6 - String.valueOf(getId()).length();
			return  " Id: " + getId() + ", "+
					" Nombre: " + getNombre() + ", " +
					" Apellido: " + getApellido() + ", " +
					" Documento: " + getDocumento() + ", " +
					" Telefono: " + getTelefono() + ", ";				  
	}
}
