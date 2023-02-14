import java.util.Random;
import java.util.Scanner;



public class Ejercicio2_DoWhile{
    public static void main(String[] args) {

    int cantidad = 0;

    double promedio = 0;

    int moda = 0;

    int mediana = 0;

    Random r = new Random();
    
    Scanner sc = new Scanner(System.in);

    int relleno = 1 ;


    cantidad = (int)(r.nextDouble() * 10);

    System.out.println("Digite [" + (cantidad) + "] numeros para determinar la media, moda y promedio");


    int[] array = new int[cantidad];  

    if(cantidad == 0){
                    
        System.out.println("No hay numeros para calcular");
    
        System.exit(0);
        
}

            int datos = 0;

//Guardado de numeros dentro de la array

            do{

            System.out.println((relleno++) + ". Digite un numero: ");

            array[datos] = sc.nextInt();

            datos++;

         } while (datos < array.length);

            datos = 0;

//Calculo del promedio

         do{

            promedio = promedio + array[datos];

            datos++;

         } while (datos < array.length);

//Calculo de la mediana
              

    if(array.length == 1){            
    
        mediana = array[0];
    
    }else{

for(int i = 0; i < array.length; i++){

    for(int j = 1 + 1; j < array.length; j++){

        if(array[i] < array[j]){

            int aux = array[i];
            int aux2 = array[j];

            array[i] = aux2;

            array[j] = aux;
            
        }

    }
}

    System.out.println("La mediana es: " + mediana);

         promedio = promedio / cantidad;


         System.out.println("El promedio es: " + promedio);

        

        }
    
    }
}