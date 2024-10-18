import java.util.Scanner;

public class PropAlquiler {
	
	public void AlquilerProp () {
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Usted Ingreso al Menú Propiedades en Alquiler");
		System.out.println("Por Favor Ingrese una Opcion");	
		
		System.out.println("1- Casas ");
		System.out.println("2- Apartamentos ");
		System.out.println("3- Ingresos ");
		System.out.println("4- Modificar ");
		System.out.println("5- Volver ");
		System.out.println("0- Salir ");
		int propAlquileres= teclado.nextInt();
		Propiedades mostrarPropiedades = new Propiedades();
		ModificarProp modificarPropiedades = new ModificarProp();
		IngresosProp ingresosProp = new IngresosProp();
		
		switch (propAlquileres) {
			case 1: AlquilerCasas.CasasAlquiler();
				break;
			case 2: AlquilerAptos.AptosAlquiler();
				break;
			case 3: ingresosProp.PropIngresos();
				break;
			case 4: modificarPropiedades.ModificarPropiedades();
				break;
			case 5: mostrarPropiedades.MostrarPropiedades();
				break;
			case 0: InmobiliariaMartinez.main(null);
				break;
		    default: System.out.println("Ingrese una Opcion Valida");
		}
		
		
	teclado.close();}

}
