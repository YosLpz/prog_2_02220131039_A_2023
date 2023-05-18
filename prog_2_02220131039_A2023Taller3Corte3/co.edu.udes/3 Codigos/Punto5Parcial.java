import java.util.Scanner;

public class Punto5Parcial{
    public static void main(String[] args) {

        int n ;

        Scanner sc = new Scanner(System.in);

        try{
        System.out.print("Introduce el número de filas del triángulo: ");
        
        n = sc.nextInt();
        System.out.println("Que alineacion desea? (1. izquierda, 2. derecha)");

        int alineacion = sc.nextInt();

        if(alineacion == 1){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
        }else if(alineacion == 2){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        
        main(args);
    
    }
    }
}
