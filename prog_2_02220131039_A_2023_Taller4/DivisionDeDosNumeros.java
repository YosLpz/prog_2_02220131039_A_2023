import java.util.Scanner;

public class DivisionDeDosNumeros {

    public static void main(String[] args) {
        
        int numero1 = 0;
        int numero2 = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = sc.nextInt();
        
        if (numero2 == 0) {
            System.out.println("ERROR: No se puede dividir por cero");
            System.exit(0);
        }
        
        System.out.println("El resultado de la division es: " + numero1 / numero2);
        
    }


}
