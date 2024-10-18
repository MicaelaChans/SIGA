import java.util.Scanner;

public class Propiedades {

	public void MostrarPropiedades() {
		
		Scanner teclado = new Scanner(System.in); 
		PropAlquiler alquiler =new PropAlquiler();
		PropVentas ventas =new PropVentas();
		Menu mostrarMenu = new Menu();
		IngresosProp ingresos = new  IngresosProp();
		ModificarProp modificar = new ModificarProp();
		
		System.out.println("Usted Ingreso al Menu Propiedades");
		System.out.println("Por Favor Ingrese una Opcion");	
		
		System.out.println("1- Alquier ");
		System.out.println("2- Ventas ");
		System.out.println("3- Ingresos ");
		System.out.println("4- Modificar ");
		System.out.println("5- Volver ");
		System.out.println("0- Salir ");		
		int menuPropiedades= teclado.nextInt();
		
		
		switch(menuPropiedades) {
			case 1: alquiler.AlquilerProp();
				break;
			case 2:ventas.VentasProp();
				break;
			case 3:ingresos.PropIngresos();
				break;
			case 4:modificar.ModificarPropiedades();
				break;
			case 5:mostrarMenu.MostrarMenu();
				break;
			case 0:InmobiliariaMartinez.main(null);
				break;
			default: System.out.println("Ingrese una Opcion Valida");	
		 
		}
		teclado.close();
		//return true;
	}
}
