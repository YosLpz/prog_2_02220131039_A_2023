import java.util.Scanner;

public class Ejercicio4_While {
    

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabra = "";
        String palabraAlrevez = "";
        int dato = 0;

        System.out.println("Introduce una palabra: ");
        palabra = sc.nextLine();


        while (dato < palabra.length()){
            
            palabraAlrevez = palabraAlrevez + palabra.charAt(palabra.length() - dato - 1);

            dato++;
        }

        System.out.println("La palabra al reves es: " + palabraAlrevez);
        

    }
}

