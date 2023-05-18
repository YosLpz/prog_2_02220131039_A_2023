import java.util.Scanner;

public class AsociacionVinicultores {

    public static void main(String[] args){

        int kilouva = 2500 ;
        char tipo = ' ';
        int tamaño = 0;

        Scanner entrada = new Scanner(System.in);
try{
        System.out.println("Ingrese el tipo de uva (Solo A o B): ");
        tipo = entrada.next().charAt(0);
        System.out.println("Ingrese el tamaño de la uva (Solo 1 o 2): ");
        tamaño = entrada.nextInt();

        if (tipo == 'A' && tamaño == 1){
            System.out.println("El precio de la uva es: " + (kilouva  + 20));
    }
        else if (tipo == 'A' && tamaño == 2){
            System.out.println("El precio de la uva es: " + (kilouva + 30));
    }
        else if (tipo == 'B' && tamaño == 1){
            System.out.println("El precio de la uva es: " + (kilouva - 30));
    }
        else if (tipo == 'B' && tamaño == 2){
            System.out.println("El precio de la uva es: " + (kilouva - 50));
    }
        else {
            System.out.println("El tipo de uva o el tamaño no es valido");
    }
}
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");
    
    main(args);

}
    }

}
