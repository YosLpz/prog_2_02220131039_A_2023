import java.util.Scanner;


public class CalificacionFinal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double NotaFinal = 0;
        double Parcial1 = 0;
        double Parcial2 = 0;
        double Parcial3 = 0;
        double ExamenFinal = 0;
        double TrabajoFinal = 0;
        double Parciales = 0;
        double Examen = 0;
        double Trabajo = 0;
       
            System.out.println("Escriba el valor de su primer parcial");
            Parcial1 = sc.nextDouble();
            System.out.println("Escriba el valor de su segundo parcial");
            Parcial2 = sc.nextDouble();
            System.out.println("Escriba el valor de su tercero parcial");
            Parcial3 = sc.nextDouble();
    
            Parciales = (int) ((Parcial1+ Parcial2 + Parcial3)/3) ;
            Parciales = (int) ((Parciales)*0.55) ;
            System.out.println("Escriba el valor de su Examen Final");
            ExamenFinal = sc.nextDouble();
           
            Examen = (int) ((ExamenFinal)*0.3);
           
            System.out.println("Escriba el valor de su Trabajo Final");
            TrabajoFinal = sc.nextDouble();
           
            Trabajo = (int) ((TrabajoFinal)*0.15);
           
            NotaFinal = (Parciales + Examen + Trabajo);
           
            System.out.println("Su Nota final es de: " + NotaFinal);
       

    }

   
}
