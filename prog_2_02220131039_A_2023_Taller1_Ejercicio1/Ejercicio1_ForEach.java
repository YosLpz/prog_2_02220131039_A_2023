import java.util.Random;


public class Taller1_ForEach {
    
    public static void main(String[] args) {
        
        int num1 = 1;

        Random r = new Random();
    
        num1 = (int)(r.nextDouble() * 10);
    
        System.out.println("El multiplicando es " + num1);

        int num2 = 1;
        
        num2 = (int)(r.nextDouble() * 10);

        System.out.println("El multiplicador es " + num2);

        int num3 = 0;

        for(int operacion : new int[num2 + 1]){
            
            operacion = num1 * num3;

            System.out.println("\n" + num1 + " x " + num3 + " = " + operacion);

            num3++;
        }
    }
}

