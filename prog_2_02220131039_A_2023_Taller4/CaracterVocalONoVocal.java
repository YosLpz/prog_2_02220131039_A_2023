import java.util.Scanner;

public class CaracterVocalONoVocal{

    public static void main(String[] args){

        char caracter = ' ';


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un caracter: ");
        caracter = sc.next().charAt(0);

        do{


        if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' || caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
            System.out.println("El caracter ingresado es una vocal");
        }else{
            System.out.println("El caracter ingresado no es una vocal");
        }

        System.out.println("Ingrese un caracter: ");
        caracter = sc.nextLine().charAt(0);




    }while(caracter != ' ');
}
}