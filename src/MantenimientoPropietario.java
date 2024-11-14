
public class MantenimientoPropietario {
		private static Utilidad util = new Utilidad();
		
		public void mostrarMenu() {
			System.out.println("Usted Ingreso al Menu de Propietarios");
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
			case 1: crearPropietario();
				break;
			case 2: eliminarPropietario();
				break;
			case 3:  modificarPropietario();
				break; 
			case 4: listarPropietario();
				break;
			case 5: buscarPropietario();
				break;
			case 6: volverMenu();
				break;
			case 0: salir();
				break;
				default: System.out.println("Error, ingrese una opcion valida");
			}
		}
		
		public void crearPropietario() {
			int id = 0, documento= 0, telefono = 0;
			String nombre = " ", apellido = " ", tipo = " "; 
			
			id = util.leerCampoInt("id");
			documento = util.leerCampoInt("documento");
			telefono = util.leerCampoInt("telefono");
			nombre = util.leerCampoStr("nombre");
			apellido = util.leerCampoStr("apellido");
			tipo = util.leerCampoStr("tipo");

			
			if (!existeId(id)) {
				Propietario iq = new Propietario (id, documento, apellido, nombre, telefono, tipo);
				InmobiliariaMartinez.propietario.add(iq);
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
		    for (int i = 0; i < InmobiliariaMartinez.propietario.size(); i++) {
		        Cliente tmp = InmobiliariaMartinez.propietario.get(i);
		        int doc = tmp.getDocumento();
		        if (doc == documento) {
		            System.out.println(tmp);
		        }
		    }
		}
		
		public boolean existeId(int id) {
			int i = 0;
			boolean existe = false;
			
			while(i < InmobiliariaMartinez.propietario.size() && !existe) {
				Cliente tmp = InmobiliariaMartinez.propietario.get(i);
				if (tmp.getId()==id) {
					existe=true;
				} i ++;
			}
			return existe;	
		}	
		
		public static void salir() {
			System.out.println("Hasta la proxima");
		}
		
		
		public void eliminarPropietario () {
			 int id = util.leerCampoInt("id del propietario a eliminar");
			    for (int i = 0; i < InmobiliariaMartinez.propietario.size(); i++) {
			    	Propietario propietario= InmobiliariaMartinez.propietario.get(i);
			        if (propietario.getId() == id) {
			            InmobiliariaMartinez.propietario.remove(i);
			            System.out.println("Propietario eliminado.");
			            return;
			        }
			    }
			    System.out.println("No se encontr� el propietario con ID " + id);
		}
		
		public void modificarPropietario() {
		    int id = util.leerCampoInt("id del propietario a modificar");
		    for (int i = 0; i < InmobiliariaMartinez.propietario.size(); i++) {
		    	Propietario propietario = InmobiliariaMartinez.propietario.get(i);
		        if (propietario.getId() == id) {
		            String nombre = util.leerCampoStr("nuevo nombre");
		            String apellido = util.leerCampoStr("nuevo apellido");
		            int telefono = util.leerCampoInt("nuevo tel�fono");
		            propietario.setNombre(nombre);
		            propietario.setApellido(apellido);
		            propietario.setTelefono(telefono);
		            System.out.println("Propietario modificado.");
		            return;
		        }
		    }
		    System.out.println("No se encontr� el propietario con ID " + id);
		}
		
		public void listarPropietario () {
			for (int i=0; i< InmobiliariaMartinez.propietario.size(); i++){
				Propietario iq = InmobiliariaMartinez.propietario.get(i);
				System.out.println(iq);
			}
		}
		
		public void buscarPropietario() {
			String documento = "";
			documento = util.leerCampoStr("documento");
			buscarPorDocumento(documento);
		}
		
		public void buscarPorDocumento(String documento) {
			for (int i=0; i< InmobiliariaMartinez.propietario.size(); i++){
				Propietario tmp = InmobiliariaMartinez.propietario.get(i);
				int doc = tmp.getDocumento();
				if (doc==0) {
					System.out.println(tmp);	
				}
				System.out.println("Propietario encontrado: " + tmp);
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
