import java.util.Scanner;

public class MediaDe3Numeros {
        
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numero3 = 0;
    int numero4 = 0;
    int numero5 = 0;

    double media = 0;

    try{
    System.out.println("Digite el primer numero");
    numero3 = sc.nextInt();
    System.out.println("Digite el segundo numero");
    numero4 = sc.nextInt();
    System.out.println("Digite el tercer numero");
    numero5 = sc.nextInt();

    media = (numero3 + numero4 + numero5) / 3;

    System.out.println("La media de los numeros es: " + media);
}
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");
    
    main(args);

}
}
}