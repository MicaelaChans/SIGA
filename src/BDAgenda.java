import java.util.Random;

public class BDAgenda {	

	private static Utilidad util = new Utilidad();
	
	public void mostrarMenu() {
		System.out.println("Usted Ingreso al Menu de Agenda");
		System.out.println("1- Cargar");
		System.out.println("2- Buscar");
		System.out.println("3- Volver");
		}
	
	public void procesarOpcion(int opcion) {		       
		        switch(opcion) {
		        case 1: 
		            cargarBD();
		            break;
		        case 2: 
		            buscarAgenda();
		            break;
		        case 3: 
		        	 volverMenu();
		            break;
		        default: 
		            System.out.println("Error, ingrese una opcion valida");
		}	
	}
	
	public void buscarDocumento() {
		int documento = util.leerCampoInt("Ingrese el numero de documento del cliente"); 
		buscarPorDocumento(documento); 
		}
	
	public void buscarPorDocumento(int documento) {
		
		for (int i = 0; i < InmobiliariaMartinez.inquilino.size(); i++) {
			Cliente tmp = InmobiliariaMartinez.inquilino.get(i);
			int doc = tmp.getDocumento();
			String strDoc = String.valueOf(doc);
			String strDocumento = String.valueOf(documento);
			if (strDoc.contains(strDocumento)) {			 
			      System.out.println("Cliente encontrado: "+ tmp);
	        }
		}
		
		System.out.println("Cliente no encontrado con el documento " + documento);
		
		for (int i = 0; i < InmobiliariaMartinez.propietario.size(); i++) {
			Cliente tmp = InmobiliariaMartinez.propietario.get(i);
		    int doc = tmp.getDocumento();
		    String strDoc = String.valueOf(doc);
			String strDocumento = String.valueOf(documento);
			if (strDoc.contains(strDocumento)) {	
				 System.out.println("Cliente encontrado: "+ tmp);
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
	        if (dir.contains(direccion)) {
	            System.out.println(tmp);
	        }
	    }
	}
	
	public void buscarAgenda() {
		System.out.println("Ingrese 1 para buscar por documento (Cliente)");
		System.out.println("Ingrese 2 para buscar por direccion (Inmueble)");
	        int buscar = util.leerOpcion();
	        if (buscar == 1) {
	            buscarDocumento();
	        } else if (buscar == 2){
	            buscarDireccion(); 
	        }
	    }
	  
	 public void cargarBD() {
		 
		 
		
		int nom =0, ap =0, doc =0, tel = 0, dor =0, ban =0, coc =0, dir =0, est =0, pre = 0, calle =0, puerta =0;
		Random r = new Random();
		String direccion = " ";
		
		String nombres [] = {"Amelia", "Sopia", "Diego", "Cristian", "Fernando", "Valentina", "Mateo", "Carlos", "Andres", 
				"Julieta", "Daniela", "Pia", "Marcelo", "Esteban", "Nicolas"};
		
		String apellidos [] = {"Gonzalez", "Lopez", "Gomez", "De la cruz", "Suarez", "Pacheco", "Estoyanoff", "Valverde", 
				"Vecino", "Ugarte", "Cavani", "Perez", "Pereira", "Rodriguez", "Novik"};
		
		String calles [] = {"Domingo Arambru", "Colonia", "8 de octubre", "18 de julio", "Av.Italia", "Av.Bulevar Artigas",
				"Mercedes", "Av.Agraciada", "Cairo", "Capurro", "Ramon caceres", "Gral Flores", "Av.Millan", "Uruguayana", "Gaboto"};
		
		String estado [] = {"Disponible", "No disponible"};
		
		int i = 1;
		int j = 1;
		
		
		for (; i <= 10; i++) {
		    doc = r.nextInt(3000000) + 1000000;  
		    nom = r.nextInt(nombres.length);  
		    ap = r.nextInt(apellidos.length); 
		    tel = r.nextInt(222222222) + 1;   
		    String nombre = nombres[nom];  
		    String apellido = apellidos[ap];  
		   
		    Inquilino tmp = new Inquilino(i, doc, tel, apellido, nombre);
		    InmobiliariaMartinez.inquilino.add(tmp);    
		    
		    Propietario tmp1 = new Propietario(i, doc, nombre, apellido, tel); 
		    InmobiliariaMartinez.propietario.add(tmp1); 
		}

		 for (; j <= 10; j++) {
		        puerta = r.nextInt(9999) + 1;
		        calle = r.nextInt(calles.length);
		        dor = r.nextInt(4); 
		        ban = r.nextInt(2); 
		        coc = r.nextInt(1); 
		        direccion = calles[calle] + " " + puerta;
		        est = r.nextInt(estado.length); 
		        pre = r.nextInt(150000) + 1; 
		        float precio = (float) pre; 

		        Inmueble tmp = new Inmueble(j, dor, ban, coc, est, direccion, precio);
		        InmobiliariaMartinez.inmueble.add(tmp);    
		    }
		 
			MantenimientoInquilino listar = new MantenimientoInquilino();
			listar.listarInquilino();
			
			MantenimientoPropietario listar1 = new MantenimientoPropietario();
			listar1.listarPropietario();
			
			MantenimientoInmueble listar2 = new MantenimientoInmueble();
			listar2.listarInmueble();
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
	