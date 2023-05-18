import java.util.Scanner;


public class LimiteInferiorYSuperiorDeUnIntervalo {
    

    public static void main(String [] args){

        int inferior = 0;
        int superior= 0;

        Scanner sc = new Scanner(System.in);


        try{
      do{
        
        System.out.println("Ingrese un el Limite superior: ");
        superior = sc.nextInt();
        System.out.println("Ingrese un el Limite inferior: ");
        inferior = sc.nextInt();

        if(inferior > superior){
        System.out.println("El limite inferior no puede ser mayor al limite superior");
        }


    }while(inferior > superior);

            int numeros, suma = 0, dentro = 0, fuera = 0;
            int valorigualSuperior = 0;
            int valorigualInferior = 0;
            int valorigual = 0;

            do {
                System.out.print("Introduce un número (0 para terminar): ");
                numeros = sc.nextInt();
                if (numeros >= inferior && numeros <= superior) {
                    suma += numeros;
                    dentro++;
                } else {
                    fuera++;
                } 
                
                if (numeros == superior) {
                    valorigualSuperior++;
                }
                if (numeros == inferior) {
                    valorigualInferior++;
                }

            } while (numeros != 0);

            valorigual = valorigualSuperior + valorigualInferior;
    
System.out.println("La suma de los números dentro del intervalo es: " + suma );

System.out.println("Hay " + fuera + " números fuera del intervalo.");

System.out.println("Se repite " + valorigual + " veces el limite inferior y superior del intervalo.");

}
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");
    
    main(args);

}
            }
        }
