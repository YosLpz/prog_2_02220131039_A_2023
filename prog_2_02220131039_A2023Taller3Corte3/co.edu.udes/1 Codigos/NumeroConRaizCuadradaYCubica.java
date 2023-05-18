import java.util.Scanner;

public class NumeroConRaizCuadradaYCubica {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int raizCuadrada = 0;
        int raizCubica = 0;
        try{
                    System.out.println("Escriba un numero entero: ");
        numero = sc.nextInt();
        
        raizCuadrada = (int) Math.sqrt(numero);
        raizCubica = (int) Math.cbrt(numero);
        
        System.out.println("La raiz cuadrada de es: " + raizCuadrada);
        System.out.println("La raiz cubica es: " + raizCubica);
    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        
        main(args);
    
    }
    }
}
