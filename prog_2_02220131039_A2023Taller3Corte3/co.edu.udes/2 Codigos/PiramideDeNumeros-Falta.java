import java.util.Scanner;


public class PiramideDeNumeros {

    public static void main(String [] args){

        int NumerosPiramide = 0;
        Scanner sc = new Scanner(System.in);

        try{
        System.out.println("Ingrese la cantidad de numeros que quiere ver en la piramide:");
        NumerosPiramide = sc.nextInt();

        for (int i = 1; i <= NumerosPiramide; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                for (int x = 1; x <= i; x--) {
                    System.out.print(x);
                }
            }
            System.out.println();
        }

    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        
        main(args);
    
    }
  

    }
    
}
