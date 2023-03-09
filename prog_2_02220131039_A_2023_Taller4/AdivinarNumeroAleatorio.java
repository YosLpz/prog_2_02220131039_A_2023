import java.util.Scanner;

public class AdivinarNumeroAleatorio {

    public static void main(String [] args){

        int numero = 0;
        int numeroAleatorio = 0;
        int intentos = 0;

        Scanner sc = new Scanner(System.in);

        numeroAleatorio = (int) (Math.random() * 100);

        for(intentos = 0; numero != numeroAleatorio; intentos++){
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();

            if (numero > numeroAleatorio){
                System.out.println("El numero ingresado es mayor al numero aleatorio");
            }else if (numero < numeroAleatorio){
                System.out.println("El numero ingresado es menor al numero aleatorio");
            }else{
                System.out.println("El numero ingresado es correcto");
                System.exit(0);
            }

            if(intentos == 10){
                System.out.println("Se ha superado el numero de intentos");
                System.exit(0);
            }

        }

        System.out.println("El numero de intentos fue de: " + intentos);

    }
    
}
