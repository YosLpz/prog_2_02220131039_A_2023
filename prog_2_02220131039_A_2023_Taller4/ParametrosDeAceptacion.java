import java.util.Scanner;

public class ParametrosDeAceptacion {
    

    public static void main(String[] args) {
        int edad = 0;
        String genero = "";
        int nota = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        System.out.println("Ingrese su genero (M para Masculino - F Para femenino): ");
        genero = sc.next();
        System.out.println("Ingrese su nota: ");
        nota = sc.nextInt();

        if (edad >= 18 && genero.equals("M") && nota >= 5) {
            System.out.println("POSIBLE");
            System.exit(0);
        }
        if (edad >= 18 && genero.equals("F") && nota >= 5) {
            System.out.println("ACEPTADA");
            System.exit(0);
        }else{
            System.out.println("NO ACEPTADA");
            
        }





}
}