import java.util.Random;

public class BDAgenda {	

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
		        case 1: 
		            cargarBD();
		            break;
		        case 2: 
		            buscardocumento();
		            break;
		        case 3: 
		            buscardocumento();
		            break;
		        case 0: 
		            salir();
		            break;
		        default: 
		            System.out.println("Error, ingrese una opcion valida");
		}
		
	}
	
	public void buscardocumento() {
		
  int documento = util.leerCampoInt("Ingrese el número de documento del cliente");
	 buscarPorDocumento(documento); 
	 
	}
		  public void buscarPorDocumento(int documento) {
		        // Suponiendo que 'InmobiliariaMartinez.inquilino' es una lista de clientes
		        for (int i = 0; i < InmobiliariaMartinez.inquilino.size(); i++) {
		            Cliente tmp = InmobiliariaMartinez.inquilino.get(i);
		            int doc = tmp.getDocumento();
		            if (doc == documento) {
		                System.out.println("Cliente encontrado: " + tmp);
		                return;
		            }
		        }
		        System.out.println("Cliente no encontrado con el documento " + documento);
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
	  /*public void buscarAgenda() {    
	        System.out.println("Ingrese 1 para buscar por documento (Cliente)");
	        System.out.println("Ingrese 2 para buscar por direccion (Inmueble)");
	        
	        int buscar = util.leerOpcion();
	        
	        if (buscar == 1) {
	            buscardocumento();  // Llamamos directamente a la búsqueda por documento
	        } else if (buscar == 2){
	            buscardocumento();  // Esta opción podrías agregarla si también necesitas buscar por dirección
	        }
	    }*/
	public void cargarBD() {
		int nom =0, ap =0, doc =0, tel = 0, dor =0, ban =0, coc =0, dir =0, est =0, pre = 0, calle =0, puerta =0;
		Random r = new Random();
		String direccion = " ";
		String nombreCompleto = " ";
		String nombres [] = {"Amelia", "Sopia", "Diego", "Cristian", "Fernando", "Valentina", "Mateo", "Carlos", "Andres", 
				"Julieta", "Daniela", "Pia", "Marcelo", "Esteban", "Nicolas"};
		
		String apellidos [] = {"Gonzalez", "Lopez", "Gomez", "De la cruz", "Suarez", "Pacheco", "Estoyanoff", "Valverde", 
				"Vecino", "Ugarte", "Cavani", "Perez", "Pereira", "Rodriguez", "Novik"};
		
		String calles [] = {"Domingo Arambru", "Colonia", "8 de octubre", "18 de julio", "Av.Italia", "Av.Bulevar Artigas",
				"Mercedes", "Av.Agraciada", "Cairo", "Capurro", "Ramon caceres", "Gral Flores", "Av.Millan", "Uruguayana", "Gaboto"};
		
		String estado [] = {"Disponible", "No disponible"};
		int i = 1;
		
		for (; i<= 20; i++) {
			doc = r.nextInt(3000000) + 1000000;
			nom = r.nextInt(nombres.length);
			ap = r.nextInt(apellidos.length);
			tel = r.nextInt(222222222) + 1;
			nombreCompleto = nombres[nom] + " " + apellidos[ap];
			//Inquilino tmp = new Inquilino(i, String.valueOf(doc), nombreCompleto, tel);
			//InmobiliariaMartinez.inquilino.add(tmp);	
		}
		
		for (; i<= 20; i++) {
			puerta = r.nextInt(9999) + 1;
			calle = r.nextInt(calles.length);
			dor = r.nextInt(4);
			ban = r.nextInt(2);
			coc = r.nextInt(1);
			direccion = calles[calle] + " " + puerta;
			est = r.nextInt(estado.length);
			pre = r.nextInt(150000) + 1;
			/*Inmueble tmp = new Inmueble(dor, ban, coc, est, direccion, pre, i );
			InmobiliariaMartinez.inmueble.add(tmp);	*/
		}
	}
	
	
	public void volverMenu () {
		  int submenu1 = 0;
	     InmobiliariaMartinez volver = new InmobiliariaMartinez();
	    	do {
	    	    volver.imprimirMenu();
	    	    submenu1 = util.leerOpcion();  
	    	    if (submenu1 != 6 && submenu1 != 0) {  
	    	        volver.procesarOpcion(submenu1);
	    	    }
	    	} while(submenu1 != 6 && submenu1 !=0 );  
	    	
	    

	}
}
	
	