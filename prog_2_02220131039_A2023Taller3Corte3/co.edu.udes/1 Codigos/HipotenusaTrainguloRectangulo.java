import java.util.Scanner;

public class HipotenusaTrainguloRectangulo {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    int cateto1 = 0;
    int cateto2 = 0;
    double hipotenusa = 0;

    try{
    System.out.println("Digite el valor del primer cateto");
    cateto1 = sc.nextInt();
    System.out.println("Digite el valor del segundo cateto");
    cateto2 = sc.nextInt();

    hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));

    System.out.println("El valor de la hipotenusa es: " + hipotenusa);
}
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");
    
    main(args);

}

}
}