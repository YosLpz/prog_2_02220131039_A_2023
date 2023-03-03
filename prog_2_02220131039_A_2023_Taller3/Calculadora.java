import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int numero1 = 0;
    int numero2 = 0;
    int suma = 0;
    int resta = 0;
    int multiplicacion = 0;
    double division = 0;

    System.out.println("Digite el primer numero");
    numero1 = sc.nextInt();
    System.out.println("Digite el segundo numero");
    numero2 = sc.nextInt();

    suma = numero1 + numero2;
    resta = numero1 - numero2;
    multiplicacion = numero1 * numero2;
    division = numero1 / numero2;


    System.out.println("La suma de los numeros es: " + suma);
    System.out.println("La resta de los numeros es: " + resta);
    System.out.println("La multiplicacion de los numeros es: " + multiplicacion);

    if (numero2 != 0){
        System.out.println("La division de los numeros es: " + division);
    }

}
}