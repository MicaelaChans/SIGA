import java.util.Scanner;

public class InmobiliariaMartinez {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Bienvenidos a S.I.G.A.");
		System.out.println("Sistemas Inmobiliarios de Gestión Automática.");
		System.out.println("Ingrese una Opcion: Entrar-1/Salir-0");		
		int menu = teclado.nextInt();		
				
		do {
			if (menu ==1) {				
				System.out.println("Menú: ");
				System.out.println("Ingrese una Opción: ");				
				
				System.out.println("1- Propiedades ");
				System.out.println("2- Propietarios ");
				System.out.println("3- Inquilinos ");
				System.out.println("0- Salir ");
				
				Propiedades mostrarPropiedades = new Propiedades();
				Propietarios mostrarPropietarios = new Propietarios();
				Inquilinos mostrarInquilinos = new Inquilinos();
				Salir sale = new Salir();
				int mostrarMenu = teclado.nextInt();
				
					switch (mostrarMenu) { 
					case 1: mostrarPropiedades.MostrarPropiedades();
						break;
					case 2: mostrarPropietarios.MostrarPropietarios();
						break;
					case 3: mostrarInquilinos.MostrarInquilinos();
						break;
					case 0:sale.MostrarSalir();
						break;
					default: System.out.println("Ingrese una Opción Valida");
				}				
			 }	
		}while(menu == 0);
			System.out.println("Usted Salió del Programa S.I.G.A.");
			System.out.println("Hasta la Próxima.");
		 //No nos sale del programa ni bien lo corremos.
		 teclado.close();
		 }
}