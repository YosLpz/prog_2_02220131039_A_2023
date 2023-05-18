import java.util.Scanner;

public class NumeroInvertido {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int numeroInvertido = 0;
        int resto = 0;
        
        try{
        System.out.println("Escriba un numero entero: ");
        numero = sc.nextInt();
        
        while (numero > 0) {
            resto = numero % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            numero = numero / 10;
        }
        
        System.out.println("El numero invertido es: " + numeroInvertido);

    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        
        main(args);
    
    }
    }
}
