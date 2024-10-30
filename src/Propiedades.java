import java.util.Scanner;

public class Propiedades {

	public void MostrarPropiedades() {
		
		Scanner teclado = new Scanner(System.in); 
		PropAlquiler identificadorAlquiler =new PropAlquiler();
		PropVentas identificadorVentas =new PropVentas();
		InmobiliariaMartinez identificadorMostrarMenu = new InmobiliariaMartinez ();
		IngresosProp identificadorIngresos = new  IngresosProp();
		ModificarProp identificadorModificar = new ModificarProp();
		Salir identificadorSalir = new Salir();
	
		System.out.println("Usted Ingreso al Menú Propiedades");
		System.out.println("Por Favor Ingrese una Opción");	
		
		System.out.println("1- Alquier ");
		System.out.println("2- Ventas ");
		System.out.println("3- Ingresos ");
		System.out.println("4- Modificar ");
		System.out.println("5- Volver ");
		System.out.println("0- Salir ");		
		int menuPropiedades= teclado.nextInt();
		
		
		switch(menuPropiedades) {
			case 1: identificadorAlquiler.AlquilerProp();
				break;
			case 2:identificadorVentas.VentasProp();
				break;
			case 3:identificadorIngresos.PropIngresos();
				break;
			case 4:identificadorModificar.ModificarPropiedades();
				break;
			case 5:identificadorMostrarMenu.main(null);
				break;
			case 0:identificadorSalir.MostrarSalir();
				break;
			default: System.out.println("Ingrese una Opcion Valida");			 
		}teclado.close();		
	}
}
