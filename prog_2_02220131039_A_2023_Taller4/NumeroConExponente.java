import  java.util.Scanner;

public class NumeroConExponente{

    public static void main(String[] args){

    int numero = 0;
    int exponente = 0;
    double resultado = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese un numero: ");
    numero = sc.nextInt();
    System.out.println("Ingrese el exponente: ");
    exponente = sc.nextInt();
        
    if (exponente < 0) {

        exponente = exponente * -1;
        resultado = Math.pow(numero, exponente);
        System.out.println("El resultado es: 1/" + resultado);
        System.exit(0);
    }    
    if (exponente == 0) {
        System.out.println("El resultado es: 1");
        System.exit(0);
    }

    
    resultado = Math.pow(numero, exponente);
    System.out.println("El resultado es: " + resultado);

    }
}
