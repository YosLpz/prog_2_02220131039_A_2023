import java.util.Scanner;

public class NumeroMayorOMenor {

    public static void main(String[] args) {
     
        
        int numero1 = 0;
        int numero2 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = sc.nextInt();

        if (numero1 == numero2) {
            System.out.println("Los numeros son iguales");
            System.exit(0);
        }
        
        if (numero1 > numero2) {
            System.out.println("El numero mayor es: " + numero1);
        } else {
            System.out.println("El numero mayor es: " + numero2);
        }
        


    }


}

