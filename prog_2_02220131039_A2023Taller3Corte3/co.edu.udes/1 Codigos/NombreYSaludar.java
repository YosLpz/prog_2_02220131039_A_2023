import java.util.Scanner;


public class  NombreYSaludar {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String nombre = "";

        try{
        System.out.println("Digite su nombre");


        nombre = sc.nextLine();

        System.out.println("Hola " + nombre);
    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        
        main(args);
    
    }

    
    }

}