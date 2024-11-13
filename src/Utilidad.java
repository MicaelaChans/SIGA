import java.util.Scanner;

public class Utilidad {
	private Scanner teclado = new Scanner(System.in);
	
	private int leerNumero() {
		int opcion = 0;
		opcion = Integer.parseInt(leerString());
		return opcion;
	}
	
	private String leerString() {
		String opcion = "";
		opcion = teclado.nextLine();
		return opcion;
	}
	
	public int leerOpcion() {
		return leerNumero();
	}
	
	public int leerCampoInt(String campo) {
		System.out.println("Ingrese " + campo);
		return leerNumero();
	}
	
	public String leerCampoStr(String campo) {
		String opcion = "";
		System.out.print("ingrese " + campo);
		opcion = teclado.nextLine();
		return opcion;
	}
	
	public float leerCampoFloat(String campo) {
		float opcion = ' ';
		System.out.print("ingrese " + campo);
		return opcion;
	}
	
}
