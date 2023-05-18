import java.util.Scanner;


public class Punto1Parcial{


public static void main(String[] args) {

    int dias;
    int horas;
    int minutos;
    int segundos;

    Scanner sc = new Scanner(System.in);

    try{
    System.out.println("Ingrese los segundos: ");

    segundos = sc.nextInt();


    System.out.println(segundos + " segundos seran: " + (dias = segundos / 86400) + " dias, " + (horas = (segundos % 86400) / 3600) + " horas, " + (minutos = (segundos % 3600) / 60) + " minutos y " + (segundos % 60) + " segundos.");

            if (horas > 12) {
                System.out.println("La hora es: " + (horas - 12) + ":" + minutos + ":" + (segundos % 60) + " PM");
            } else {
                System.out.println("La hora es: " + horas + ":" + minutos + ":" + (segundos % 60) + " AM");
            }

        }
        catch(Exception e){
            System.out.println("Haz cometido un error, vuelve a intentarlo");
            
            main(args);
        
        }
    }

}
