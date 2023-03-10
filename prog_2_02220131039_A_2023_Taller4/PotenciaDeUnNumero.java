import java.util.Scanner;

public class PotenciaDeUnNumero {
    
    public static void main(String [] args) {

        int base = 0;
        int basepotencia = 0;
        int exponente = 0;


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la base: ");
        base = sc.nextInt();
        System.out.println("Ingrese el exponente: ");
        exponente = sc.nextInt();

        basepotencia = base ;
        for (int i = 1; i < exponente; i++){  
            base = base * basepotencia;
            System.out.println(base);
        }

        System.out.println("El resultado es: " + base);



    }


}
