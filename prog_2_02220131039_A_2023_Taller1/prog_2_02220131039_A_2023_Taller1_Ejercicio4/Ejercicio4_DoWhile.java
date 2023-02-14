import java.util.Scanner;

public class Ejercicio4_DoWhile {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String palabra = "";
            String palabraAlrevez = "";
            int dato = 0;

            System.out.println("Introduce una palabra: ");
            palabra = sc.nextLine();

            do {
                palabraAlrevez = palabraAlrevez + palabra.charAt(palabra.length() - dato - 1);

                dato++;
            } while (dato < palabra.length());

            System.out.println("La palabra al reves es: " + palabraAlrevez);
            

        }
    }