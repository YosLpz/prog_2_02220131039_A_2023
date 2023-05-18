import java.util.Scanner;

public class NumerosParesEntreDosNumeros {
    
    public static void main(String [] args){

        int numero1 = 0;
        int numero2 = 0;

        Scanner sc = new Scanner(System.in);

        try{
        System.out.println("Ingrese un numero: ");
        numero1 = sc.nextInt();

        System.out.println("Ingrese otro numero: ");
        numero2 = sc.nextInt();

        if(numero1 < numero2){
            for(int i = numero1; i <= numero2; i++){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
        }else if(numero2 < numero1){
            for(int i = numero2; i <= numero1; i++){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
        }else if(numero1 == numero2){
            System.out.println("Los numeros son iguales");
        }

    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        
        main(args);
    
    }
    }
}
