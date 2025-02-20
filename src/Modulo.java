import java.util.Scanner;

public class Modulo {


    public void Modulo() {

        Scanner sc = new Scanner(System.in);

        double valor1 = 0;
        double valor2 = 0;

        System.out.println("Ingrese un numero:");
        valor1 = sc.nextDouble();
        System.out.println("ingrese segundo valor");
        valor2 = sc.nextDouble();
        System.out.println(valor1 + " % " + valor2);
        //Modulo
        System.out.println("El resultado es = " + valor1 % valor2);

    }
}
