import java.util.Scanner;


public class Cronometro {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
try{
        
        for(int i = 0; i <= 60; i++){
            for(int j = 0; j <= 60; j++){

                for(int k = 0; k <= 60; k++){

                
                    System.out.println("Horas: " +i + " Minutos: " + j + " Segundos:" + k);

                }
        
        }
}
}
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");
    
    main(args);

}

    }


}
