
public class MantenimientoInquilino {
	
	private static Utilidad util = new Utilidad();
	
	public static void mostrarMenu() {
		System.out.println("Usted Ingreso al Menu de Clientes");
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
		case 1: crearInquilino();
			break;
		case 2: eliminarInquilino();
			break;
		case 3:  modificarInquilino();
			break; 
		case 4: listarInquilino();
			break;
		case 5: buscarInquilino();
			break;
		case 6: volverMenu();
			break;
		case 0: salir();
		break;
			default: System.out.println("Error, ingrese una opcion valida");
		}
		
	}
	
	public static void salir() {
		System.out.println("no vimo");
	}
	
	public void crearInquilino() {
		int id = 0, documento= 0, telefono = 0;
		String nombre = " ", apellido = " ", tipo = " "; 
		
		id = util.leerCampoInt("id");
		documento = util.leerCampoInt("documento");
		telefono = util.leerCampoInt("telefono");
		nombre = util.leerCampoStr("nombre");
		apellido = util.leerCampoStr("apellido");
		tipo = util.leerCampoStr("tipo");	
		
		
		if (!existeId(id)) {
			Inquilino iq = new Inquilino (id, documento, telefono, nombre, apellido, tipo);
			InmobiliariaMartinez.inquilino.add(iq);
		} else {
			System.out.println("Error! Id Existe");
		}
	}
	
	public void buscardocumento() {
		int documento = 0;
		documento = util.leerCampoInt("documento");
		buscarPorDocumento(documento);					
	}
	
	public void buscarPorDocumento(int documento) {
	    for (int i = 0; i < InmobiliariaMartinez.inquilino.size(); i++) {
	        Cliente tmp = InmobiliariaMartinez.inquilino.get(i);
	        int doc = tmp.getDocumento();
	        if (doc == documento) {
	            System.out.println(tmp);
	        }
	    }
	}
	
	public boolean existeId(int id) {
		int i = 0;
		boolean existe = false;
		
		while(i < InmobiliariaMartinez.inquilino.size() && !existe) {
			Cliente tmp = InmobiliariaMartinez.inquilino.get(i);
			if (tmp.getId()==id) {
				existe=true;
			} i ++;
		}
		return existe;	
	}	
	
	public void eliminarInquilino () {
		
	}
	
	public void modificarInquilino () {
		
	}
	
	public void listarInquilino () {
		for (int i=0; i< InmobiliariaMartinez.inquilino.size(); i++) {
			Inquilino iq = InmobiliariaMartinez.inquilino.get(i);
			System.out.println(iq);
		}
	}
	
	public void buscarInquilino() {
		int documento = 0;
		documento = util.leerCampoInt("documento");
		buscarPorDocumento(documento);
	}

	
	public void volverMenu () {
		System.out.println("Volviendo al menú principal...");
	    InmobiliariaMartinez.imprimirMenu();
	} 
}