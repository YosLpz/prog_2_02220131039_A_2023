import java.util.Scanner;

public class LadoContrarioDelDado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado = 0;
        int ladocontrario = 0;

        System.out.println("Ingrese el numero de la cara del dado");
        lado = sc.nextInt();

  switch (lado) {
            case 1:
                ladocontrario = 6;
                break;
            case 2:
                ladocontrario = 5;
                break;
            case 3:
                ladocontrario = 4;
                break;
            case 4:
                ladocontrario = 3;
                break;
            case 5:
                ladocontrario = 2;
                break;
            case 6:
                ladocontrario = 1;
                break;
            default:
                System.out.println("El numero ingresado no es valido");
                System.exit(0);
                break;
        }

        System.out.println("El la cara del dado es ["+ lado + "] Y el lado contrario es: [" +  ladocontrario + "]");
    }
    
}
