import java.util.Scanner;
public class NotaFinal {
    

    public static void main(String[] args) {

        int RespuestasCorrectas = 0;
        int RespuestasIncorrectas = 0;
        int RespuestasEnBlanco = 0;
        int NotaFinal = 0;
        int RespuestasCorrectasValor = 5;
        int RespuestasIncorrectasValor = -1;
        int RespuestasEnBlancoValor = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba el numero de respuestas correctas: ");
        RespuestasCorrectas = sc.nextInt();
        System.out.println("Escriba el numero de respuestas incorrectas: ");
        RespuestasIncorrectas = sc.nextInt();
        System.out.println("Escriba el numero de respuestas en blanco: ");
        RespuestasEnBlanco = sc.nextInt();

        NotaFinal = (RespuestasCorrectas * RespuestasCorrectasValor) + (RespuestasIncorrectas * RespuestasIncorrectasValor) + (RespuestasEnBlanco * RespuestasEnBlancoValor);

        System.out.println("La nota final es: " + NotaFinal);

        
 

    }
}
