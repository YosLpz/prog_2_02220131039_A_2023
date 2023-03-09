import java.util.Scanner;


public class ViajeDeEstudios {

        public static void main(String[] args){

            int alumnos = 0;
            int pago = 0;
            int total = 0;
            
            Scanner entrada = new Scanner(System.in);

            System.out.println("Ingrese la cantidad de alumnos: ");
            alumnos = entrada.nextInt();
            
            if (alumnos >= 100){
                pago = 65;
            }
            else if (alumnos >= 50){
                pago = 70;
            }
            else if (alumnos >= 30){
                pago = 95;
            }
            else {
                pago = 4000 / alumnos;
            }

            total = pago * alumnos;

            System.out.println("El pago por alumno es: " + pago);
            System.out.println("El pago total es: " + total);

            

        }

}
