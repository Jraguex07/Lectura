
package numeroentero_decimal;
import java.util.Scanner;


public class Numeroentero_decimal {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingresa un número :");
            System.out.println("o salir");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) {
                continuar = false;
            } else if (esEntero(input)) {
                System.out.println("El número ingresado es un número entero.");
            } else if (esDecimal(input)) {
                System.out.println("El número ingresado es un número decimal.");
            } else {
                System.out.println("El valor ingresado no es un número válido.");
            }
        }
    }

    private static boolean esEntero(String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean esDecimal(String numero) {
        try {
            Double.parseDouble(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

