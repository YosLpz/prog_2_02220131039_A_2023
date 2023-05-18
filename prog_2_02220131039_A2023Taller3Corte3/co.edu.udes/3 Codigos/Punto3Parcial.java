import java.util.Scanner;

public class Punto3Parcial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int i = 1;

        int latas = 0;
        
        try{
        System.out.println("ingrese el numero de latas que desea apilar triangularmente");
        latas = sc.nextInt();


        while (sum + i <= latas) {
            sum += i;
            i++;
        }
        if (sum == latas) {
            System.out.println("se puede apilar triangularmente");
        } else {
            System.out.println("no se puede apilar triangularmente");
            System.out.println("La cantidad mas cercana que se puede apilar es " + sum);
        }
    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        
        main(args);
    
    }
        
    }
}