import java.util.Scanner;

public class DiaDeLaSemana {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = 0;
        String diaSemana = " ";

        System.out.println("Ingrese el numero del dia de la semana");
        dia = sc.nextInt();

        switch (dia) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miercoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sabado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                System.out.println("El numero ingresado no es valido");
                System.exit(0);
                break;
        }
    }
}
