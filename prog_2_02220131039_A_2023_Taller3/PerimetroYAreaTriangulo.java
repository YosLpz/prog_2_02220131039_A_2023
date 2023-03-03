import java.util.Scanner;


public class PerimetroYAreaTriangulo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
    int base = 0;
    int altura = 0;
    int perimetro = 0;
    int area = 0;

   
    System.out.println("Digite la base del rectangulo");
    base = sc.nextInt();
    System.out.println("Digite la altura del rectangulo");
    altura = sc.nextInt();
    perimetro = (base * 2) + (altura * 2);
    area = base * altura;


    System.out.println("El perimetro del triangulo es: " + perimetro);
    System.out.println("El area del triangulo es: " + area);
}
}