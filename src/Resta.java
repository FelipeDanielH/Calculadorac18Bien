import java.util.Scanner;

public class Resta {

    public void resta() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un primer número: ");
        int a = sc.nextInt();
        System.out.println("Digite un segundo número: ");
        int b = sc.nextInt();

        System.out.println("el resultado de la resta es " + (a - b));

        sc.close();


    }

        


}
