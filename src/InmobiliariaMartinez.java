import java.util.Scanner;

public class InmobiliariaMartinez {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Bienvenidos a S.I.G.A.");
		System.out.println("Sistemas Inmobiliarios de Gestion Automatica.");
		System.out.println("Ingrese una Opcion: Entrar-1/Salir-0");
		
		int menu = teclado.nextInt();
		Menu mostrarMenu = new Menu();
		
		
		 if (menu ==1) {
			 System.out.println(mostrarMenu.MostrarMenu());
		 }else if (menu == 0){
			 System.out.println("Usted Salio del Programa S.I.G.A.");
		 }
		
		 teclado.close();
	}

}