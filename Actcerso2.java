import java.util.Scanner;

public class IndiceMasaCorporal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el peso en kilogramos:");
        double peso = sc.nextDouble();
        System.out.println("Introduce la altura en metros:");
        double altura = sc.nextDouble();
        
        double ims = peso / (altura * altura);
        System.out.println("Tu IMS es: " + ims);
        
        if (ims >= 18 && ims <= 25) {
            System.out.println("Tu peso está en el intervalo saludable.");
        } else {
            System.out.println("Tu peso no está en el intervalo saludable.");
        }
    }
}