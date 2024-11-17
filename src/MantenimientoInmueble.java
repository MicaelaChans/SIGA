
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
		default: System.out.println("Error, ingrese una opcion valida");
		}
	}
	
	public void crearInmueble() {
		int id = 0, dormitorios = 0, banos = 0, cocheras = 0, estado = 0;
		String direccion = " "; 
		float precio = ' ';
		
		id = util.leerCampoInt("id");
		dormitorios = util.leerCampoInt("dormitorios");
		banos = util.leerCampoInt("banos");
		cocheras = util.leerCampoInt("cocheras");
		estado = util.leerCampoInt("1- en venta/2-en alquiler/3-ocupada");
		direccion = util.leerCampoStr("direccion");
		precio = util.leerCampoFloat("precio");		
		
		
		if (!existeId(id)) {
			Inmueble in = new Inmueble (id, dormitorios, banos, cocheras, estado, direccion, precio) ;
			InmobiliariaMartinez.inmueble.add(in);
		} else {
			System.out.println("Error! Id Existe");
		}
	} 
	    
	private void vincularInq() {
		MantenimientoInquilino mi = new MantenimientoInquilino();
		int idInmueble =0, idInquilino =0, i=0, encontro =0;
		Inmueble tmp = null;
		idInmueble = util.leerCampoInt("Propiedad a vincular ");
		idInquilino = util.leerCampoInt("Id Inquilino");
		
		while (i< InmobiliariaMartinez.inmueble.size() && encontro ==0) {
			tmp = InmobiliariaMartinez.inmueble.get(i);
			if (tmp.getId()== idInmueble) {
				encontro =1;
				if (mi.existeId(idInquilino)) {
					tmp.setVincularInq(idInquilino);
					InmobiliariaMartinez.inmueble.set(i, tmp);
				}else {
					System.out.println("El Inquilino no Existe...");
				}
			}
			i++;
		}
		
	}
	
	private void vincularPro() {
		MantenimientoPropietario mi = new MantenimientoPropietario();
		int idInmueble =0, idPropietario =0, i=0, encontro =0;
		Inmueble tmp = null;
		idInmueble = util.leerCampoInt("Propiedad a vincular ");
		idPropietario = util.leerCampoInt("Id Propietario");
		
		while (i< InmobiliariaMartinez.inmueble.size() && encontro ==0) {
			tmp = InmobiliariaMartinez.inmueble.get(i);
			if (tmp.getId()== idInmueble) {
				encontro =1;
				if (mi.existeId(idPropietario)) {
					tmp.setVincularInq(idPropietario);
					InmobiliariaMartinez.inmueble.set(i, tmp);
				}else {
					System.out.println("El Propietario no Existe...");
				}
			}
			i++;
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
	
	public void eliminarInmueble() {
		int id = util.leerCampoInt("id del inmueble a eliminar");
	    for (int i = 0; i < InmobiliariaMartinez.inmueble.size(); i++) {
	        Inmueble inmueble = InmobiliariaMartinez.inmueble.get(i);
	        if (inmueble.getId() == id) {
	            InmobiliariaMartinez.inmueble.remove(i);
	            System.out.println("Inmueble eliminado.");
	            return;
	        }
	    }
	    System.out.println("No se encontr� el inmueble con ID " + id);
	}
	
	public void modificarInmueble () {
		int id = util.leerCampoInt("id del inmueble a modificar");
	    for (int i = 0; i < InmobiliariaMartinez.inmueble.size(); i++) {
	        Inmueble inmueble = InmobiliariaMartinez.inmueble.get(i);
	        if (inmueble.getId() == id) {
	            int dormitorio = util.leerCampoInt("nuevos dormitorios");
	            int banos = util.leerCampoInt("nuevos banos");
	            int cochera = util.leerCampoInt("nuevas cocheras");
	            int estado = util.leerCampoInt("nuevo estado");
	            inmueble.setDormitorios(dormitorio);
	            inmueble.setBanos(banos);
	            inmueble.setCocheras(cochera);
	            inmueble.setEstado(estado);
	            System.out.println("Inmueble modificado.");
	            return;
	        }
	    }
	    System.out.println("No se encontr� el inmueble con ID " + id);
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
		    System.out.println("Volviendo al menú principal...");
	}
}