import java.util.Scanner;

public class ElMaximoYMinimoDeUnaArray {

    public static void main(String[] args) {
        
        int[] numeros = new int[10];
        int maximo = 0;
        int minimo = 999999999;
        Scanner sc = new Scanner(System.in);
        
        try{
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == maximo) {
                System.out.println(maximo + " - Maximo");
            }
            if (numeros[i] == minimo) {
                System.out.println(minimo + " - Minimo");
            }else {
                System.out.println(i);
            }



        }
    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        
        main(args);
    
    }
    }
    
}
