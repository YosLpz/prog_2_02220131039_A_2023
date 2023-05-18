import java.util.Scanner;

public class AgenciaDeTranportes {
    
    public static void main(String [] args){

        int peso = 0;
        int Lugar = 0;
        double precio = 0;


        Scanner sc = new Scanner(System.in);
try{
        System.out.println("Ingrese el peso de su paquete en kilogramos: ");
        peso = sc.nextInt();

        if (peso > 5){
            System.out.println("El paquete no podra ser enviado ya que excede los 5kg");
        }else{
            System.out.println("Ingrese el lugar de destino: ");
            System.out.println("(1) America Del Norte (2) America central (3) America del Sur (4) Europa (5) Asia");
            Lugar = sc.nextInt();

            switch (Lugar) {
                case 1:
                    precio = 24;
                    break;
                case 2:
                    precio = 20;
                    break;
                case 3:
                    precio = 21;
                    break;
                case 4:
                    precio = 10;
                    break;
                case 5:
                    precio = 18;
                    break;
                default:
                    System.out.println("El numero ingresado no es valido");
                    System.exit(0);
                    break;
            }

            System.out.println("El precio del envio es de: " + precio + " euros");

        }
    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        
        main(args);
    
    }
    }
}
