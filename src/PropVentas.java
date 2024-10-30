import java.util.Scanner;

public class PropVentas {
	public void VentasProp () {
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Usted Ingreso al Menu Venta de Propiedades");
		System.out.println("Por Favor Ingrese una Opcion");	
		
		System.out.println("1- Casas ");
		System.out.println("2- Apartamentos ");
		System.out.println("3- Ingresos ");
		System.out.println("4- Modificar ");
		System.out.println("5- Volver ");
		System.out.println("0- Salir ");
		int propVenta= teclado.nextInt();
		Propiedades mostrarPropiedades = new Propiedades();
		ModificarProp identificadorModificarPropiedades = new ModificarProp();
		IngresosProp ingresosProp = new IngresosProp();
		VentasCasas casasVentas = new VentasCasas();
		VentasAptos aptosVentas = new VentasAptos();
		
		switch (propVenta){
		case 1: casasVentas.VentaCasa();
		break;
	case 2: aptosVentas.VentaApto();
		break;
	case 3: ingresosProp.PropIngresos();
		break;
	case 4: identificadorModificarPropiedades.ModificarPropiedades();
		break;
	case 5: mostrarPropiedades.MostrarPropiedades();
		break;
	case 0: InmobiliariaMartinez.main(null);
		break;
    default: System.out.println("Ingrese una Opcion Valida");
		}	
			teclado.close();
		}
}
