import java.util.Scanner;


public class  NombreYSaludar {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String nombre = "";

        System.out.println("Digite su nombre");


        nombre = sc.nextLine();

        System.out.println("Hola " + nombre);


    
    }

}