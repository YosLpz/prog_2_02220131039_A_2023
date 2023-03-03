import java.util.Scanner;
public class MinutosYHorasEquivalentes {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("--------------------------------------------");

    int minutos = 0;
    int horas = 0;
    int minutosRestantes = 0;

    System.out.println("Digite los minutos");
    minutos = sc.nextInt();

    horas = minutos / 60;
    minutosRestantes = minutos % 60;

    System.out.println("La cantidad de horas es: " + horas);
    System.out.println("La cantidad de minutos restantes es: " + minutosRestantes);

}
}