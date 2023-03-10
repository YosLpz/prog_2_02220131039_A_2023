import java.util.Scanner;


public class PagoEn20Meses {

    public static void main(String [] args){

        int precio = 0;
        int preciofinal = 0;
        int meses = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        precio = sc.nextInt();
        System.out.println("Ingrese la cantidad de meses: ");
        meses = sc.nextInt();

        for (int i = 1; i <= meses; i++) {
            preciofinal = precio;
            System.out.println( i + " mes: " + precio + " euros");
            precio = precio * 2;
        }
    
            System.out.println("El precio final es: " + preciofinal + " euros");

    
    }



}
