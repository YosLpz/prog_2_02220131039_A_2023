import java.util.Scanner;

public class Punto8Parcial {

    public static void main(String[] args) {
       
        int numeroAsignaturas;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el numero de asignaturas: ");
        numeroAsignaturas = entrada.nextInt();

        int[] notas = new int[numeroAsignaturas];

        for(int i = 0; i < numeroAsignaturas; i++){
        System.out.println("Ingrese el nombre de la asignatura: ");
        String nombreAsignatura = entrada.next();
        
        }
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese las horas de cada asignatura:");
            notas[i] = entrada.nextInt();
        }









    }
    
}
