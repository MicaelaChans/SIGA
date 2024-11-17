import java.util.ArrayList;

public class InmobiliariaMartinez {
    private static Utilidad util = new Utilidad();
    public static ArrayList<Inquilino> inquilino = new ArrayList<>();
    public static ArrayList<Inmueble> inmueble = new ArrayList<>();
    public static ArrayList<Agenda> agenda = new ArrayList<>();
    public static ArrayList<Propietario> propietario = new ArrayList<>();
    public static boolean salir = false; 
   
    //BDAgenda cargar = new BDAgenda(); lo que dijo claudio...
    
    
    public static void main(String[] args) {
        System.out.println("Bienvenidos a S.I.G.A.");
        System.out.println("Sistemas Inmobiliarios de Gestion Automatica.");    

        int opcion = 0;
        do {
            imprimirMenu();
            opcion = util.leerOpcion();
            procesarOpcion(opcion);
        } while(opcion != 0 && !salir); 
        salir();
    }

    public static void imprimirMenu() {
        System.out.println("Menu principal: ");
        System.out.println("Ingrese una opcion: ");
        System.out.println("1- Inquilinos");
        System.out.println("2- Propietarios");
        System.out.println("3- Inmuebles");
        System.out.println("4- Agenda");
        System.out.println("0- Salir");
    }

    public static void salir() {
        System.out.println("Hasta la proxima");
    }

    public static void procesarOpcion(int opcion) {
        switch(opcion) {
            case 1:
                MantenimientoInquilino mc = new MantenimientoInquilino();
                int submenu = 0;
                do {
                    mc.mostrarMenu();
                    submenu = util.leerOpcion();
                    if(submenu != 6 && submenu != 0) {
                        mc.procesarOpcion(submenu);
                    }
                    if (submenu == 0) {  
                        salir = true;  
                        return;
                    }
                } while(submenu != 6 && submenu != 0 && !salir);
                break;
            case 2:
                MantenimientoPropietario md = new MantenimientoPropietario();
                int submenu2 = 0;
                do {
                    md.mostrarMenu();
                    submenu2 = util.leerOpcion();
                    if (submenu2 != 6 && submenu2 != 0) {
                        md.procesarOpcion(submenu2);
                    }
                    if (submenu2 == 0) {  
                        salir = true;
                        return;
                    }
                } while(submenu2 != 6 && submenu2 != 0 && !salir);
                break;
            case 3:
                MantenimientoInmueble mp = new MantenimientoInmueble();
                int submenu3 = 0;
                do {
                    mp.mostrarMenu();
                    submenu3 = util.leerOpcion();
                    if (submenu3 != 6 && submenu3 != 0) {
                        mp.procesarOpcion(submenu3);
                    }
                    if (submenu3 == 0) {  
                        salir = true;
                        return;
                    }
                } while(submenu3 != 6 && submenu3 != 0 && !salir);
                break;
            case 4:
                BDAgenda ag = new BDAgenda();
                int submenu4 = 0;
                do {
                    ag.mostrarMenu();
                    submenu4 = util.leerOpcion();
                    if (submenu4 != 3 && submenu4 != 0) {
                        ag.procesarOpcion(submenu4);
                    }
                    if (submenu4 == 0) {  
                        salir = true;
                        return;
                    }
                } while(submenu4 != 3 && submenu4 != 0 && !salir);
                break;
            case 0:
                salir = true;
                break;
            default:
                System.out.println("*Error* Ingrese una opción valida");
        }
    }
}
