import java.util.Scanner;

public class VentaConComision {
    public static void main(String[] args) {

        
                Scanner sc = new Scanner(System.in);
               
            int SueldoBase = 0;
            int SueldoMasComision = 0;
            int SueldoFinal = 0;
            int venta1 = 0;
            int venta2 = 0;
            int venta3 = 0;
                System.out.println("Ingrese el valor de la primera venta");
                venta1 = sc.nextInt();
                System.out.println("Ingrese el valor de la segunda venta");
                venta2 = sc.nextInt();
                System.out.println("Ingrese el valor de la tercera venta");
                venta3 = sc.nextInt();
           
            SueldoBase = (venta1 + venta2 + venta3);
           
           SueldoMasComision =(int) ((SueldoBase)* 0.1);
           
           SueldoFinal = (SueldoBase + SueldoMasComision);
        
                System.out.println("El sueldo final fue de: "+ SueldoFinal);
    }
}