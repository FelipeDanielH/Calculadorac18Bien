import java.util.Scanner;

public class Division {

     public void division() {

         double dividendo, divisor, resultado;

         Scanner sc = new Scanner(System.in);

         System.out.println("Ingresa el dividendo: ");
         dividendo = sc.nextDouble();

         System.out.println("Ingresa el divisor: ");
         divisor = sc.nextDouble();
         if (divisor == 0) {
             System.out.println("El divisor no puede ser zero");
         } else {
             resultado = dividendo / divisor;
             System.out.println("El resultado es: " + resultado);
         }
         sc.close();
     }

    }





