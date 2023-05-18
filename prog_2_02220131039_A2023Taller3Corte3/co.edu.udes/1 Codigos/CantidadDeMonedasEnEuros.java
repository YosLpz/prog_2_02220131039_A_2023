import java.util.Scanner;
public class CantidadDeMonedasEnEuros {
    

    public static void main(String[] args) {

        double monedas2euros = 0;
        double monedas1euro = 0;
        double monedas50centimos = 0;
        double monedas20centimos = 0;
        double monedas10centimos = 0;

        double cantidadDeMonedas = 0;

        Scanner sc = new Scanner(System.in);

        try{
        System.out.println("Escriba la cantidad de monedas de 2 euros: ");
        monedas2euros = sc.nextDouble();
        System.out.println("Escriba la cantidad de monedas de 1 euro: ");
        monedas1euro = sc.nextDouble();
        System.out.println("Escriba la cantidad de monedas de 50 centimos: ");
        monedas50centimos = sc.nextDouble();
        System.out.println("Escriba la cantidad de monedas de 20 centimos: ");
        monedas20centimos = sc.nextDouble();
        System.out.println("Escriba la cantidad de monedas de 10 centimos: ");
        monedas10centimos = sc.nextDouble();

        cantidadDeMonedas = (monedas2euros * 2) + (monedas1euro * 1) + (monedas50centimos * 0.5) + (monedas20centimos * 0.2) + (monedas10centimos * 0.1);

        System.out.println("Tienes " + cantidadDeMonedas + " euros" + "centimos");
    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        
        main(args);
    
    }


    }

}
