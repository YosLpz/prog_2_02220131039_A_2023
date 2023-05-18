import java.util.Scanner;

public class NumerosMayorMenorOIgualA0 {
    
    public static void main (String []args ){


        int cantidad = 0;

        Scanner sc = new Scanner(System.in);

        try{
        System.out.println("Ingrese la cantidad de numeros que desea ingresar: ");
        cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el numero: ");
            int numero = sc.nextInt();

            if (numero > 0) {
                System.out.println("El numero es mayor a 0");
            } else if (numero < 0) {
                System.out.println("El numero es menor a 0");
            } else if (numero == 0) {
                System.out.println("El numero es igual a 0");
            }
        }

    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        
        main(args);
    
    }
    }

}
