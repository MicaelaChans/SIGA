import java.util.Scanner;

public class Propiedades extends Inmueble {
	 public Propiedades(int id, int dormitorios, int banos, int cocheras, String estado, String direccion, float precio) {
			super(id, dormitorios, banos, cocheras, estado, direccion, precio); }

		public void Inmueble() {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Usted ingreso al menu Inmueble");		
			int inmueble = teclado.nextInt();
		}

		public String toString() {
			return "Dormitorios: " + getDormitorios() + 
					" Baños: " + getBanos() + 
					" Cocheras: " + getCocheras() + 
					" Estado: " + getEstado() +
					" Dirección: " + getDireccion() +
					" Precio: " + getPrecio() +
					" Id: " + getId(); 
		}
	}

