import java.util.Scanner;

public class RaicesEcuacionSegundoGrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el coeficiente a:");
        double a = sc.nextDouble();
        System.out.println("Introduce el coeficiente b:");
        double b = sc.nextDouble();
        System.out.println("Introduce el coeficiente c:");
        double c = sc.nextDouble();
        
        double discriminante = b * b - 4 * a * c;
        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces son: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("La ecuación tiene una única raíz: " + raiz);
        } else {
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("Las raíces son complejas: " + parteReal + " + " + parteImaginaria + "i y " + parteReal + " - " + parteImaginaria + "i");
        }
    }
}
