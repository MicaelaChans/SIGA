import java.util.Scanner;

public class Salir {

	public static void MostrarSalir() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Usted desea Salir del Programa?");
		System.out.println("1-Si/0-No");
		int salir = teclado.nextInt();
		
		if (salir ==1) {
			System.out.println("El Programa se ha Cerrado");
		}else if(salir ==0) {
			System.out.println("Usted volvio al Menú Principal");
			
		}teclado.close();
		
	}
}
