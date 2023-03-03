import java.util.Scanner;

public class ViajeEnHorasMinutosYSegundos {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int segundos = 0;

        System.out.println("Estas en un viaje a una ciudad escribe la cantidad de segundos que dura el viaje para calcularte las horas minutos y segundos que tardaras en llegar");
        System.out.println("Escriba el tiempo en segundos: ");
        segundos = sc.nextInt();

        int horas = segundos / 3600;    
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = (segundos % 3600) % 60;

        System.out.println("El tiempo que tardaras en llegar es: " + horas + " horas " + minutos + " minutos " + segundosRestantes + " segundos");
        
    }
}
