import java.util.Scanner;

public class CambiarValorEntreVariables {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1 = 0;
        int valor2 = 0;
        int auxiliar = 0;
        
        System.out.println("Escribale un valor a la variable 1:");
        valor1 = sc.nextInt();
        System.out.println("Escriba un valor a la variable 2: ");
        valor2 = sc.nextInt();
        
        auxiliar = valor1;
        valor1 = valor2;
        valor2 = auxiliar;
        
        System.out.println("El valor de la variable 1 es: " + valor1);
        System.out.println("El valor de la variable 2 es: " + valor2);
    }
}
