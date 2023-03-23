import java.util.Scanner;

public class Punto4Parcial{
    public static void main(String[] args) {
        int a = 0;
        int b = 1; 
        int c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de elementos a visualizar: ");

        int numero ;
        numero = sc.nextInt();

        System.out.print("Serie de Fibonacci: ");
        
        for (int i = 1; i <= numero; i++) {

            System.out.print(a + " ");

            c = a + b;

            a = b;

            b = c;
        }
    }
}




