import java.util.Scanner;

public class Inquilinos {

	public void MostrarInquilinos () {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Usted ingresó a la Opción Inquilinos");		
		System.out.println("Ingrese 1 Para Mostrar las Propiedades/0 Para Volver al Menu");
		int inquilinos = teclado.nextInt();
		InmobiliariaMartinez identificadorMostrarMenu = new InmobiliariaMartinez ();
		
		if (inquilinos ==1) {
			System.out.println("HOla");
		}else if (inquilinos==0){
			identificadorMostrarMenu.main(null);
		}
		teclado.close();
	}

}
