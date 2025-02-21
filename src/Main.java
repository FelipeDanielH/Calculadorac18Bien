import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 0;
        //menu
        System.out.println("menu ingrese numero");
        System.out.println("1.Division");
        System.out.println("2.Modulo");
        System.out.println("3.Raiz Cuadrada");
        System.out.println("4.Resta");
        option = sc.nextInt();


        if(option == 1){
            Division division = new Division();
            division.division();
        }
        if(option == 2){
            Modulo modulo = new Modulo();
            modulo.Modulo();
        }
        if(option == 3){
            RaizCuadrada raizCuadrada = new RaizCuadrada();
            raizCuadrada.raizCuadrada();
        }
        if(option == 4) {
            Resta resta = new Resta();
            resta.resta();
        }

    }
}