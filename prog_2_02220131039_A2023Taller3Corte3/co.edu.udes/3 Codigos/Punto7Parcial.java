import java.util.Arrays;
import java.util.Scanner;

public class Punto7Parcial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
        System.out.print("Ingrese el tamaño de los vectores: ");
        int tamaño1 = sc.nextInt();

        int[] vector1 = new int[tamaño1];
        System.out.print("Ingrese los elementos del primer vector: ");
        for (int i = 0; i < tamaño1; i++) {
            vector1[i] = sc.nextInt();
        }

        int[] vector2 = new int[tamaño1];
        System.out.print("Ingrese los elementos del segundo vector: ");
        for (int i = 0; i < tamaño1; i++) {
            vector2[i] = sc.nextInt();
        }

        int[] vector3 = new int[tamaño1 * 2];
        for (int i = 0; i < tamaño1; i++) {
            vector3[i] = vector1[i];
            vector3[tamaño1 + i] = vector2[i];
        }

        Arrays.sort(vector3);

        System.out.print("El tercer vector ordenado de manera ascendente es: ");
        for (int i = 0; i < tamaño1 * 2; i++) {
            System.out.print(vector3[i] + " ");
        }

        for (int i = 0; i < tamaño1 * 2 - 1; i++) {
            for (int j = i + 1; j < tamaño1 * 2; j++) {
                if (vector3[i] < vector3[j]) {
                    int x = vector3[i];
                    vector3[i] = vector3[j];
                    vector3[j] = x;
                }
            }
        }

        System.out.print("El tercer vector ordenado de manera descendente es: ");
        for (int i = 0; i < tamaño1 * 2; i++) {
            System.out.print(vector3[i] + " ");
        }
    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        
        main(args);
    
    }
    }
}
