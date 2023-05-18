import java.util.Scanner;

public class DistanciaEntreDosNumeros {


    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
    int numero1 = 0;
    int numero2 = 0;
    int distancia = 0;
   
    try{
    System.out.println("Digite el primer numero para calcular la distancia");
   
    numero1 = sc.nextInt();
   
    System.out.println("Digite el segundo numero para calcular la distancia");

    numero2 = sc.nextInt();
   
    distancia = (numero1 - numero2);
   
    System.out.println("La distancia entre los dos numeros es de: " + distancia);
}
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");
    
    main(args);

}

}
}