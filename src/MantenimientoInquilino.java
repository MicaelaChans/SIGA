import java.util.Scanner;

public class MantenimientoInquilino {
	private static Utilidad util = new Utilidad();
	
	public void mostrarMenu() {
		System.out.println("Usted Ingresó al Menú de Clientes");
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
		case 1: crearCliente();
			break;
		case 2: //eliminarCliente();
			break;
		case 3: //modificarCliente();
			break; 
		case 4: //listarClente();
			break;
		case 5: //buscarCliente();
			break;
		case 6: //volverMenu();
			break;
		case 0: salir();
			default: System.out.println("Error, ingrese una opción válida");
		}
		
	}
	
	public void crearCliente() {
		int id = 0, documento= 0, telefono = 0;
		String nombre = "", apellido = "", tipo = ""; 
		char correo = ' ';
		
		id = util.leerCampoInt("id");
		documento = util.leerCampoInt("documento");
		telefono = util.leerCampoInt("telefono");
		nombre = util.leerCampoStr("nombre");
		apellido = util.leerCampoStr("apellido");
		tipo = util.leerCampoStr("tipo");
		correo = util.leerCampoChar("correo");		
		
		
		if (!existeId(id)) {
			Cliente cl = new Cliente (id, documento, telefono, nombre, apellido, tipo, correo);
			InmobiliariaMartinez.clientes.add(cl);
		}else {
			System.out.println("Error! Id Existe");
		}
	}
	
	public void buscardocumento() {
		int documento = 0;
		documento = util.leerCampoInt("documento");
		buscarPordocumento(documento);					
	}
	
	public void buscarPordocumento(int documento) {
		for (int i=0; i<InmobiliariaMartinez.clientes.size(); i++) {
			Cliente tmp = InmobiliariaMartinez.clientes.get(i);
			int doc = tmp.getDocumento();
			if(doc.Integer.valueOf(documento));
				System.out.println(tmp);
		}
		
	}
	/*public MantenimientoCliente(String nombre, String apellido, int documento, char correo, int telefono, String tipo, int id) {
		super(id, documento, nombre, apellido, correo, telefono, tipo);
	}

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
	}
	
	public String toString() {
		return  " Nombre: " + getNombre() + 
				" Apellido: " + getApellido() + 
				" Documento: " + getDocumento() + 
				" Correo: " + getCorreo() +
				" Telefono: " + getTelefono() +
				" Tipo: " + getTipo() +
				" Id: " + getId(); 
	}*/
	public boolean existeId(int id) {
		int i = 0;
		boolean existe = false;
		
		while(i < InmobiliariaMartinez.clientes.size() && !existe) {
			Cliente tmp = InmobiliariaMartinez.clientes.get(i);
			if (tmp.getId()==id) {
				existe=true;
			}i ++;
		}
		return existe;	
	}	
	
	public static void salir() {
		System.out.println("Hasta la proxima");
	}
}
