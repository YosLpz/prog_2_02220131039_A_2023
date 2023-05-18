import java.util.Scanner;

public class DivisionDeDosNumeros {

    public static void main(String[] args) {
        
        int numero1 = 0;
        int numero2 = 0;
        Scanner sc = new Scanner(System.in);
        
        try{
        System.out.println("Ingrese el primer numero: ");
        numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = sc.nextInt();
        
        if (numero2 == 0) {
            System.out.println("ERROR: No se puede dividir por cero");
            System.exit(0);
        }
        
        System.out.println("El resultado de la division es: " + numero1 / numero2);
    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        
        main(args);
    
    }
        
    }


}
