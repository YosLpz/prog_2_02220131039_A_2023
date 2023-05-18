import java.util.Scanner;


public class NumerosPrimos {

    public static void main(String [] args){

        int NumerosPrimos = 0;
        int contador = 0;

        Scanner sc = new Scanner(System.in);

        try{
        System.out.println("Ingrese la cantidad de numeros primos que quiere ver:");
        NumerosPrimos = sc.nextInt();

        for (int i = 1; i <= NumerosPrimos; i++) {
            int numero = ;
            while (numero < i) {
                if (i % numero == 0) {
                    contador++;
                }
                numero++;
            }
            if (contador == 0) {
                System.out.println(i);
            }
            contador = 0;
            
        }

    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        
        main(args);
    
    }
    }
            
    }



    

