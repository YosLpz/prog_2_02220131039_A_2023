import java.util.Scanner;

public class Punto6Parcial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase = "";

        System.out.println("Ingrese una frase: ");
        frase = sc.nextLine();
    
        int palabras = 0;
        int letras = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                palabras++;
            } else {
                letras++;
            }
        }

        System.out.println("La frase tiene " + (palabras + 1) + " palabras y " + letras + " letras.");


}
}