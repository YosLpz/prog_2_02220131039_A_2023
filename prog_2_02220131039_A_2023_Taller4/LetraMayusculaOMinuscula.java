import java.util.Scanner;

public class LetraMayusculaOMinuscula {

    public static void main(String[] args) {
        
        char letra = ' ';
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una letra: ");
        letra = sc.next().charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("La letra es mayuscula");
        } else {
            System.out.println("La letra es minuscula");
        }

    }


}