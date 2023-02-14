import java.util.Scanner;

public class Ejercicio4_ForEach {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String palabra = "";
        String palabraAlrevez = "";


        System.out.println("Introduce una palabra: ");
        palabra = sc.nextLine();

        for ( char dato : palabra.toCharArray()) {

            palabraAlrevez = dato + palabraAlrevez;
            
        }
        
        System.out.println("La palabra al reves es: " + palabraAlrevez);
    }

}
