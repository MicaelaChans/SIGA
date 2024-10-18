import java.util.Scanner;

public class Menu {

		public boolean MostrarMenu() {
			
			Scanner teclado = new Scanner(System.in);                 
			System.out.println("Menú: ");
			System.out.println("Ingrese una Opción: ");
			
			
			System.out.println("1- Propiedades ");
			System.out.println("2- Propietarios ");
			System.out.println("3- Inquilinos ");
			System.out.println("0- Salir ");
			int menu= teclado.nextInt();
			Propiedades mostrarPropiedades = new Propiedades();
			
			
			switch (menu) { 
				case 1: mostrarPropiedades.MostrarPropiedades();
					break;
				case 2: Propietarios.MostrarPropietarios();
					break;
				case 3:Inquilinos.MostrarInquilinos();
					break;
				case 0:Salir.MostrarSalir();
					break;
				default: System.out.println("Ingrese una Opción Valida");
				
				}	
			teclado.close(); 
			return true;
			}
	}

