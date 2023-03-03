import java.util.Scanner;

public class FahrenheitACelsius {
    
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    double fahrenheit = 0;
    double celsius = 0;

    System.out.println("Digite la temperatura en grados Fahrenheit");
    fahrenheit = sc.nextDouble();

    celsius = (fahrenheit - 32) * 5/9;

    System.out.println("La temperatura en grados Celsius es: " + celsius);

}
}