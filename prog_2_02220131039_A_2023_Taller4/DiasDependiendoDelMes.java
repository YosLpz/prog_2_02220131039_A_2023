import java.util.Scanner;

import javax.swing.JSpinner.NumberEditor;
public class DiasDependiendoDelMes {

    public static void main(String[] args ){

        int numerodemes = 0;
        int dias = 0;

        Scanner sc= new Scanner(System.in);

        System.out.println("Ingrese el numero del mes");
        numerodemes = sc.nextInt();

        switch (numerodemes) {
            case 1:
                dias = 31;
                break;
            case 2:
                dias = 28;
                break;
            case 3:
                dias = 31;
                break;
            case 4:
                dias = 30;
                break;
            case 5:
                dias = 31;
                break;
            case 6:
                dias = 30;
                break;
            case 7:
                dias = 31;
                break;
            case 8:
                dias = 31;
                break;
            case 9:
                dias = 30;
                break;
            case 10:
                dias = 31;
                break;
            case 11:
                dias = 30;
                break;
            case 12:
                dias = 31;
                break;
            default:
                System.out.println("El numero ingresado no es valido");
                System.exit(0);
                break;
        }

        System.out.println("El mes  [" + numerodemes + "] tiene [" + dias + "] dias");



    }
    
}
