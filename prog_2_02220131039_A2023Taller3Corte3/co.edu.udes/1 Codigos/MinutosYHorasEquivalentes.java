import java.util.Scanner;
public class MinutosYHorasEquivalentes {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("--------------------------------------------");

    int minutos = 0;
    int horas = 0;
    int minutosRestantes = 0;

    try{
    System.out.println("Digite los minutos");
    minutos = sc.nextInt();

    horas = minutos / 60;
    minutosRestantes = minutos % 60;

    System.out.println("La cantidad de horas es: " + horas);
    System.out.println("La cantidad de minutos restantes es: " + minutosRestantes);

}
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");
    
    main(args);

}

}
}