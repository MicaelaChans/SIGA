import java.util.Scanner;

public class Salir {

	public void MostrarSalir() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Usted desea Salir del Programa?");
		System.out.println("1-Si/2-No");		
		int salir = teclado.nextInt();
		InmobiliariaMartinez mostrarMenu = new InmobiliariaMartinez ();
		
		
		if (salir ==1) {			
			System.out.println("Usted Salió del Programa");
			System.out.println("Hasta la Próxima");
			
		}else if (salir ==0) {
			mostrarMenu.main(null);
		}
		
		teclado.close();		
	}
}
