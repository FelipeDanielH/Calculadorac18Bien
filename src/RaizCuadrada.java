import java.util.Scanner;

public class RaizCuadrada {

    public void raizCuadrada() {

        Scanner sc = new Scanner(System.in);

        double numero = 0;

        System.out.println("Ingrese un numero: ");
        numero = sc.nextDouble();

        System.out.println("el resultado es: " + Math.sqrt(numero));

    }
}
