import java.util.Scanner;


public class ParesDeNumerosEnElPlano {

        public static void main(    String[] args) {
        Scanner sc = new Scanner(System.in);
    int x1 = 0;
    int x2 = 0;
    int y1 = 0;
    int y2 = 0;
    int PuntoEnElPlano = 0;
   
    try{
        System.out.println("Escriba el valor del punto x1 :");
        x1 = sc.nextInt();
                System.out.println("Escriba el valor del punto x2 :");
        x2 = sc.nextInt();
                System.out.println("Escriba el valor del punto y1 :");
        y1 = sc.nextInt();
                System.out.println("Escriba el valor del punto y2 :");
        y2 = sc.nextInt();
       
        PuntoEnElPlano = (x1 * y2) - (x2 * y1);

        System.out.println("El valor del punto en el plano es: " + PuntoEnElPlano);
}
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");
    
    main(args);

}
    
}

}