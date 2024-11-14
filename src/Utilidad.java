import java.util.Scanner;

public class Utilidad {
    private Scanner teclado = new Scanner(System.in);

    private int leerNumero() {
        int numero = -1;
        boolean esValido = false;

        while (!esValido) {
            try {
                String entrada = leerString();
                numero = Integer.parseInt(entrada);
                esValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inv�lida. Por favor, ingrese un n�mero entero.");
            }
        }
        return numero;
    }

    private String leerString() {
        String entrada = "";
        while (entrada.isEmpty()) {
            entrada = teclado.nextLine().trim();
            if (entrada.isEmpty()) {
                System.out.println("La entrada no puede estar vac�a. Intente de nuevo:");
            }
        }
        return entrada;
    }

    public int leerOpcion() {
        System.out.print("Ingrese una opci�n: ");
        return leerNumero();
    }

    public int leerCampoInt(String campo) {
        System.out.println("Ingrese " + campo + ":");
        return leerNumero();
    }

    public String leerCampoStr(String campo) {
        String entrada;
        boolean esValido = false;

        do {
            System.out.print("Ingrese " + campo + ": ");
            entrada = leerString();

            if (entrada.matches(".*\\d.*")) {
                System.out.println("Entrada inv�lida. Por favor, ingrese solo letras para el campo " + campo + ".");
            } else {
                esValido = true;
            }
        } while (!esValido);
        return entrada;
    }

    public float leerCampoFloat(String campo) {
        float numero = -1;
        boolean esValido = false;

        while (!esValido) {
            try {
                System.out.print("Ingrese " + campo + ": ");
                String entrada = leerString();
                numero = Float.parseFloat(entrada);
                esValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inv�lida. Por favor, ingrese un n�mero decimal.");
            }
        }
        return numero;
    }
}