import java.util.ArrayList;
import java.util.Scanner;

public class InmobiliariaMartinez {
	private static Utilidad util = new Utilidad();
	public static ArrayList<Inquilino> inquilino = new ArrayList<Inquilino>();
	public static ArrayList<Inmueble> inmueble = new ArrayList<Inmueble>();
	public static ArrayList<Agenda> agenda = new ArrayList<Agenda>();

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Bienvenidos a S.I.G.A.");
		System.out.println("Sistemas Inmobiliarios de Gestionn Automatica.");	
		
		int opcion = 0;
		do {
			imprimirMenu();
			opcion = util.leerOpcion();
			procesarOpcion(opcion);
			
		}while(opcion!= 0);
		teclado.close();
	}
	
	public static void salir() {
		System.out.println("Chau");
	}
	
	public static void imprimirMenu() {
		System.out.println("Menu: ");			
		System.out.println("Ingrese una opcion: ");
		System.out.println("1- Clientes");
		System.out.println("2- Inmuebles");
		System.out.println("3- Agenda");
		System.out.println("0- Salir");
	
	}
		
	public static void procesarOpcion(int opcion1) {
		switch(opcion1){
		case 1: MantenimientoInquilino mc = new MantenimientoInquilino();
		  int submenu = 0;
		  do {
			  mc.mostrarMenu();
			  submenu = util.leerOpcion();
			  mc.procesarOpcion(submenu);
			} while(submenu!=0);
		  break;
		case 2:  MantenimientoInmueble mp = new MantenimientoInmueble();
        int submenu1 = 0;
        do {
            mp.mostrarMenu();
            submenu1 = util.leerOpcion();  
            if (submenu1 != 6) { 
                mp.procesarOpcion(submenu1);
            }
        } while (submenu1 != 6 && submenu1 != 0);
			 break;
		case 3: BDAgenda ag = new BDAgenda();
		  int submenu2 = 0;
		  do {
			  ag.mostrarMenu();
			  submenu1 = util.leerOpcion();
			  ag.procesarOpcion(submenu2);
			} while(submenu2!=0);
			break;
		case 0: salir(); 
		break;
		default: System.out.println("*Error* Ingrese una opcion valida");
		break;
		}
	}		
}
