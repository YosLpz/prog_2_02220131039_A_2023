import java.util.Scanner;

public class Ejercicio4_For {

    public  static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabra = "";
        String palabraAlrevez = "";

        System.out.println("Introduce una palabra: ");
        palabra = sc.nextLine();

        for (int dato = 0; dato < palabra.length(); dato++) {
            palabraAlrevez = palabraAlrevez + palabra.charAt(palabra.length() - dato - 1);

        }

        System.out.println("La palabra al reves es: " + palabraAlrevez);
    }
}