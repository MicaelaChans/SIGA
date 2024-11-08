import java.util.ArrayList;
import java.util.Scanner;

public class InmobiliariaMartinez {
	private static Utilidad util = new Utilidad();
	public static ArrayList<Inquilino> inquilino = new ArrayList<Inquilino>();
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Bienvenidos a S.I.G.A.");
		System.out.println("Sistemas Inmobiliarios de Gestión Automática.");	
		
		int opcion = 0;
		do {
			imprimirMenu();
			opcion = util.leerOpcion();
			procesarOpcion(opcion);
			
		}while(opcion!=0);
		
		salir();
	}
	
	public static void imprimirMenu() {
		System.out.println("Menu: ");			
		System.out.println("Ingrese una opcion: ");
		System.out.println("1- Clientes");
		System.out.println("2- Inmuebles");
		System.out.println("0- Salir");
	
	}
	
	public static void salir() {
		System.out.println("Hasta la proxima");
	}
		
	public static void procesarOpcion(int opcion) {
		switch(opcion){
		case 1: MantenimientoInquilino mc = new MantenimientoInquilino();
		  int submenu = 0;
		  do {
			  mc.mostrarMenu();
			  submenu = util.leerOpcion();
			  mc.procesarOpcion(submenu);
			} while(submenu!=0);
		  break;
		case 2:
			 break;
		case 3:
			break;
		default: System.out.println("*Error* Ingrese una opcion valida");
		}
	}		
	}
