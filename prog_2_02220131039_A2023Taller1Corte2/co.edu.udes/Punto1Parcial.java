import java.util.Scanner;


public class Punto1Parcial{


public static void main(String[] args) {

    int dias;
    int horas;
    int minutos;
    int segundos;

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese los segundos: ");

    segundos = sc.nextInt();

    System.out.println(segundos + " segundos seran: " + (dias = segundos / 86400) + " dias, " + (horas = (segundos % 86400) / 3600) + " horas, " + (minutos = (segundos % 3600) / 60) + " minutos y " + (segundos % 60) + " segundos.");
}

    
}