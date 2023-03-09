import java.util.Scanner;

public class TiposDeCircunferencias {
    
    public static void main(String[] args){

        int circunferenciax1 = 0;
        int circunferenciax2 = 0;
        int circunferenciay1 = 0;
        int circunferenciay2 = 0;
        int radio1 = 0;
        int radio2 = 0;
        double distancia = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la coordenada x de la circunferencia 1: ");
        circunferenciax1 = sc.nextInt();
        System.out.println("Ingrese la coordenada y de la circunferencia 1: ");
        circunferenciay1 = sc.nextInt();
        System.out.println("Ingrese el radio de la circunferencia 1: ");
        radio1 = sc.nextInt();
        System.out.println("Ingrese la coordenada x de la circunferencia 2: ");
        circunferenciax2 = sc.nextInt();
        System.out.println("Ingrese la coordenada y de la circunferencia 2: ");
        circunferenciay2 = sc.nextInt();
        System.out.println("Ingrese el radio de la circunferencia 2: ");
        radio2 = sc.nextInt();

        distancia = Math.sqrt(Math.pow(circunferenciax2 - circunferenciax1, 2) + Math.pow(circunferenciay2 - circunferenciay1, 2));

        if (circunferenciax1 == circunferenciax2 && circunferenciay1 == circunferenciay2 && radio1 == radio2) {
            
            System.out.println("Las circunferencias son concéntricas.");
            
        } else if (distancia > radio1 + radio2) {
            
            System.out.println("Las circunferencias son exteriores.");
            
        } else if (distancia == radio1 + radio2) {
            
            System.out.println("Las circunferencias son tangentes exteriores.");
            
        } else if (distancia < Math.abs(radio1 - radio2)) {
            
            System.out.println("Las circunferencias son interiores.");
            
        } else if (distancia == Math.abs(radio1 - radio2)) {
            
            System.out.println("Las circunferencias son tangentes interiores.");
            
        } else {
            
            System.out.println("Las circunferencias son secantes.");
            
        }







    }


}
