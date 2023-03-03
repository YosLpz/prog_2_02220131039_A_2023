import java.util.Scanner;

public class NumeroInvertido {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int numeroInvertido = 0;
        int resto = 0;
        
        System.out.println("Escriba un numero entero: ");
        numero = sc.nextInt();
        
        while (numero > 0) {
            resto = numero % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            numero = numero / 10;
        }
        
        System.out.println("El numero invertido es: " + numeroInvertido);
    }
}
