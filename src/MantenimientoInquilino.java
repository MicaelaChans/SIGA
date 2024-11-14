
public class MantenimientoInquilino {
	
	private static Utilidad util = new Utilidad();
	
	public void mostrarMenu() {
		System.out.println("Usted Ingreso al Menu de Inquilinos");
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
		
			default: System.out.println("Error, ingrese una opcion valida");
		}
		
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
	
	public static void salir() {
		System.out.println("Hasta la proxima");
	}
	
	
	public void eliminarInquilino () {
		 int id = util.leerCampoInt("id del inquilino a eliminar");
		    for (int i = 0; i < InmobiliariaMartinez.inquilino.size(); i++) {
		        Inquilino inquilino = InmobiliariaMartinez.inquilino.get(i);
		        if (inquilino.getId() == id) {
		            InmobiliariaMartinez.inquilino.remove(i);
		            System.out.println("Inquilino eliminado.");
		            return;
		        }
		    }
		    System.out.println("No se encontró el inquilino con ID " + id);
	}
	
	public void modificarInquilino() {
	    int id = util.leerCampoInt("id del inquilino a modificar");
	    for (int i = 0; i < InmobiliariaMartinez.inquilino.size(); i++) {
	        Inquilino inquilino = InmobiliariaMartinez.inquilino.get(i);
	        if (inquilino.getId() == id) {
	            String nombre = util.leerCampoStr("nuevo nombre");
	            String apellido = util.leerCampoStr("nuevo apellido");
	            int telefono = util.leerCampoInt("nuevo teléfono");
	            inquilino.setNombre(nombre);
	            inquilino.setApellido(apellido);
	            inquilino.setTelefono(telefono);
	            System.out.println("Inquilino modificado.");
	            return;
	        }
	    }
	    System.out.println("No se encontró el inquilino con ID " + id);
	}
	
	public void listarInquilino () {
		for (int i=0; i< InmobiliariaMartinez.inquilino.size(); i++){
			Inquilino iq = InmobiliariaMartinez.inquilino.get(i);
			System.out.println(iq);
		}
	}
	
	public void buscarInquilino() {
		String documento = "";
		documento = util.leerCampoStr("documento");
		buscarPorDocumento(documento);
	}
	
	public void buscarPorDocumento(String documento) {
		for (int i=0; i< InmobiliariaMartinez.inquilino.size(); i++){
			Inquilino tmp = InmobiliariaMartinez.inquilino.get(i);
			int doc = tmp.getDocumento();
			if (doc==0) {
				System.out.println(tmp);	
			}
			System.out.println("Cliente encontrado: " + tmp);
		}
	}
	
	public void volverMenu() {
	    int opcion = 0;
	    do {	
	        mostrarMenu();  
	        opcion = util.leerOpcion();  
	        procesarOpcion(opcion); 
	    } while (opcion != 0);
	}	
}
