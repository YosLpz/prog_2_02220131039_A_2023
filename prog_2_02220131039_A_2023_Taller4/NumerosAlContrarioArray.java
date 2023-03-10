import java.util.Scanner;

public class NumerosAlContrarioArray {
    
    public static void main(String[] args) {
        
        int[] numeros = new int[10];
        int[] numerosAlContrario = new int[10];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }
        
        for (int i = 0; i < numeros.length; i++) {
            numerosAlContrario[i] = numeros[numeros.length - 1 - i];
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numerosAlContrario[i]);
        }

        //Profe aqui no entendi muy bien el ejercicio ya que dice cambiar el orde Y VICEVERSA entonces yo lo hice que luego de cambiar el orden lo imprimiera nuevamente de forma normal
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
