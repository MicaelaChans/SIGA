
public class MantenimientoInmueble  {

	
private static Utilidad util = new Utilidad();
	
	public void mostrarMenu() {
		System.out.println("Usted Ingreso al Menu de Inmuebles");
		System.out.println("1- Agregar");
		System.out.println("2- Eliminar");
		System.out.println("3- Modificar");
		System.out.println("4- Listar");
		System.out.println("5- Buscar");
		System.out.println("6- Volver");
		System.out.println("0- Salir");
	}
	
	public void procesarOpcion(int opcion) {		
		switch(opcion) {
		case 1: crearInmueble();
			break;
		case 2: eliminarInmueble();
			break;
		case 3:  modificarInmueble();
			break; 
		case 4: listarInmueble();
			break;
		case 5: buscarInmueble();
			break;
		case 6: volverMenu();
			break;
		case 0: salir();
			default: System.out.println("Error, ingrese una opcion valida");
		}
		
	}
	
	public void crearInmueble() {
		int id = 0, dormitorios = 0, banos = 0, cocheras = 0;
		String estado = " ", direccion = " "; 
		float precio = ' ';
		
		id = util.leerCampoInt("id");
		dormitorios = util.leerCampoInt("dormitorios");
		banos = util.leerCampoInt("ba�os");
		cocheras = util.leerCampoInt("cocheras");
		estado = util.leerCampoStr("estado");
		direccion = util.leerCampoStr("direccion");
		precio = util.leerCampoFloat("precio");		
		
		
		if (!existeId(id)) {
			Inmueble in = new Inmueble (id, dormitorios, banos, cocheras, estado, direccion, precio) ;
			InmobiliariaMartinez.inmueble.add(in);
		} else {
			System.out.println("Error! Id Existe");
		}
	} 
	    
	public boolean existeId(int id) {
		int i = 0;
		boolean existe = false;
		
		while(i < InmobiliariaMartinez.inmueble.size() && !existe) {
			Inmueble tmp = InmobiliariaMartinez.inmueble.get(i);
			if (tmp.getId()==id) {
				existe=true;
			} i ++;
		}
		return existe;	
	}	
	
	public static void salir() {
		System.out.println("Hasta la proxima");
	}
	
	
	public void eliminarInmueble() {
		
	}
	
	public void modificarInmueble () {
		
	}
	
	public void listarInmueble () {
		for (int i=0; i< InmobiliariaMartinez.inmueble.size(); i++){
			Inmueble inm = InmobiliariaMartinez.inmueble.get(i);
			System.out.println(inm);
		}
	}
	
	public void buscarInmueble() {
		String direccion = " ";
		direccion = util.leerCampoStr("direccion");
		buscarPorDireccion(direccion);					
	}
	
	public void buscarPorDireccion(String direccion) {
	    for (int i = 0; i < InmobiliariaMartinez.inmueble.size(); i++) {
	        Inmueble tmp = InmobiliariaMartinez.inmueble.get(i);
	        String dir = tmp.getDireccion();
	        if (dir.contains(direccion)) {
	            System.out.println(tmp);
	        }
	    }
	}
	public void volverMenu () {
		 int opcion = 0;
	        do {
	            volverMenu();
	            opcion = util.leerOpcion();
	            procesarOpcion(opcion);

	        }while(opcion!=0);
	}

}
