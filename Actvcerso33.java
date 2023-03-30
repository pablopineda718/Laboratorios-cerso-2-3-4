import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Error: Debe ingresar 3 parámetros");
            return;
        }

        char operacion = args[0].charAt(0);
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);

        switch (operacion) {
            case 'S':
            case 's':
                System.out.println("Suma: " + (num1 + num2));
                break;
            case 'R':
            case 'r':
                System.out.println("Resta: " + (num1 - num2));
                break;
            case 'P':
            case 'p':
            case 'M':
            case 'm':
                System.out.println("Producto: " + (num1 * num2));
                break;
            case 'D':
            case 'd':
                if (num2 == 0) {
                    System.out.println("Error: División por cero");
                } else {
                    System.out.println("División: " + ((double) num1 / num2));
                }
                break;
            default:
                System.out.println("Error: Operación inválida");
                break;
        }

    }

}
