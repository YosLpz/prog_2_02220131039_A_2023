import java.util.Scanner;

public class TipoDeTriangulo {
    
    public static void main(String[] args){

        int tamaño1 = 0;
        int tamaño2 = 0;
        int tamaño3 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del lado 1: ");
        tamaño1 = sc.nextInt();
        System.out.println("Ingrese el tamaño del lado 2: ");
        tamaño2 = sc.nextInt();
        System.out.println("Ingrese el tamaño del lado 3: ");
        tamaño3 = sc.nextInt();

        if (tamaño1 == tamaño2 && tamaño2 == tamaño3) {
            System.out.println("El triangulo es equilatero");
            System.exit(0);
        }
        if (tamaño1 == tamaño2 && tamaño2 != tamaño3) {
            System.out.println("El triangulo es isosceles");    
            System.exit(0);
        }
        if (tamaño1 != tamaño2 && tamaño2 != tamaño3) {
            System.out.println("El triangulo es escaleno");
            System.exit(0);
        }
        if (tamaño1 == tamaño3 && tamaño2 != tamaño3) {
            System.out.println("El triangulo es rectangulo");
            System.exit(0);
        }


    }

}
