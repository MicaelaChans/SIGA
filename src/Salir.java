import java.util.Scanner;

public class Salir {

	public void MostrarSalir() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Usted desea Salir del Programa?");
		System.out.println("1-Si/2-No");		
		int salir = teclado.nextInt();
		InmobiliariaMartinez mostrarMenu = new InmobiliariaMartinez ();
		
		
		if (salir ==1 || salir==2) {			
		switch(salir){
		case 1:System.out.println("El Programa se ha Cerrado");
			break;
		case 2:mostrarMenu.main(null);
			break;
		default:System.out.println("Ingrese una Opción Valida"); 	
		}	
		}teclado.close();		
	}
}
