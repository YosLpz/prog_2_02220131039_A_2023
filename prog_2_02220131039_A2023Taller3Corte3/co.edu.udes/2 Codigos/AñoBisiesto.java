import java.util.Scanner;

public class AñoBisiesto {

    public static void main(String []args){

        int año = 0;

        Scanner sc = new Scanner(System.in);
try{
        System.out.println("Digite el año para saber si es un año bisiesto");

        año = sc.nextInt();

        if((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))){

            System.out.println("El año " + año + " es un año bisiesto");
            System.exit(0);

        }else{
            System.out.println("El año " + año + " No es un año bisiesto");
            System.exit(0);

        }
    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        
        main(args);
    
    }
        //Java tambien nos ofrece una herramienta para saber si un año es bisiesto o no que seria utilizando la herramienta GregorianCalendar

    }

}
