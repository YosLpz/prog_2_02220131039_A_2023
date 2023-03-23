import java.util.Scanner;

public class Punto5Parcial{
    public static void main(String[] args) {

        int n ;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de filas del triángulo: ");
        
        n = sc.nextInt();

        //Triangulo con asteristicos

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}