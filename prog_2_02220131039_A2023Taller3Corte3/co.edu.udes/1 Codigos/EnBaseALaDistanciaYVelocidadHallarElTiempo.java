import java.util.Scanner;

public class EnBaseALaDistanciaYVelocidadHallarElTiempo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Distancia = 0;
        int VelocidadVehiculo1 = 0;
        int VelocidadVehiculo2 = 0;
        int tiempo = 0;

try{
        System.out.println("Escriba la distancia en kilometros ");
        Distancia = sc.nextInt();
        System.out.println("Escriba la velocidad del vehiculo que esta atras en kilometros por hora");
        VelocidadVehiculo1 = sc.nextInt();

        System.out.println("Escriba la velocidad del vehiculo que esta adelante en kilometros por hora");

        VelocidadVehiculo2 = sc.nextInt();

        if(VelocidadVehiculo1 < VelocidadVehiculo2){
            System.out.println("La velocidad del vehiculo que esta atras debe ser mayor que la del vehiculo que esta adelante");
        }else{  
            tiempo = Distancia / (VelocidadVehiculo1 - VelocidadVehiculo2);
            System.out.println("El tiempo que tarda el vehiculo que esta atras en alcanzar al vehiculo que esta adelante es: " + tiempo + " horas");
        }
    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        
        main(args);
    
    }
            



    }
}
