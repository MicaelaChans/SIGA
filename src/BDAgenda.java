
public class BDAgenda extends Agenda {
	
	public BDAgenda (int id, int documento, String nombre, String apellido, char correo, int telefono, String tipo, int dormitorios, int banos, int cocheras, String estado, String direccion, float precio) {
		super(id, documento, nombre, apellido, correo, telefono, tipo, dormitorios, banos, cocheras, estado, direccion, precio); }

	private static Utilidad util = new Utilidad();
	
	public void mostrarMenu() {
		System.out.println("Usted Ingreso al Menu de Agenda");
		System.out.println("1- Listar");
		System.out.println("2- Buscar");
		System.out.println("3- Volver");
		System.out.println("0- Salir");
	}
	
	public void procesarOpcion(int opcion) {		
		switch(opcion) {
		case 1: listarAgenda();
			break;
		case 2: buscarAgenda();
			break;
		case 3: volverMenu();
			break;
		case 0: salir();
			default: System.out.println("Error, ingrese una opcion valida");
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
	
	public void buscarDireccion() {
		String direccion = " ";
		direccion = util.leerCampoStr("direccion");
		buscarPorDireccion(direccion);					
	}
	
	public void buscarPorDireccion(String direccion) {
	    for (int i = 0; i < InmobiliariaMartinez.inmueble.size(); i++) {
	        Inmueble tmp = InmobiliariaMartinez.inmueble.get(i);
	        String dir = tmp.getDireccion();
	        if (dir == direccion) {
	            System.out.println(tmp);
	        }
	    }
	}
	
	public static void salir() {
		System.out.println("Hasta la proxima");
	}
	
	
	public void listarAgenda () {
		
	}
	
	public void buscarAgenda() {
	
	}
	
	public void volverMenu () {
		
	}
}
	
