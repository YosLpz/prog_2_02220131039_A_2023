import java.util.Random;

import java.util.Scanner;

import java.util.Arrays;


public class Ejercicio2_For{
    public static void main(String[] args) {

    int cantidad = 0;

    double promedio = 0;

    int moda = 0;

    double mediana = 0;

    Random r = new Random();
    
    Scanner sc = new Scanner(System.in);

    int relleno = 1 ;


    cantidad = (int)(r.nextDouble() * 39);

    System.out.println("Digite [" + (cantidad) + "] numeros para determinar la media, moda y promedio");


    int[] array = new int[cantidad];  

    if(cantidad == 0){
                    
        System.out.println("No hay numeros para calcular");
    
        System.exit(0);
        
}

            int datos = 0;

//Guardado de numeros dentro de la array

            for(datos = 0; datos < array.length; datos++){

            System.out.println((relleno++) + ". Digite un numero: ");

            array[datos] = sc.nextInt();


         } 

            datos = 0;

//Organizar numeros de menor a mayor en la array

            Arrays.sort(array);

//Calculo del promedio

        for(datos = 0; datos < array.length; datos++){

            promedio = promedio + array[datos];

         }

         promedio = promedio / cantidad;

//Calculo de la mediana

              

    if(array.length == 1){            
    
        mediana = array[0];
    
    }else{
    
            if(array.length / 2 == 0){
    
                mediana = (int) (array[(array.length / 2) + 1] + array[(array.length / 2) ]) / 2;
    
            }else{
    
                mediana = (int) array[array.length / 2];
            }

//Calculo de la moda

            int NumerosRepetidos = 0;

            int num1 = 0;

            for(num1 = 0; num1 < array.length; num1++){

                int CantidadRepetidos = 0;

                int num2 = 0;

                for(num2 = 0; num2 < array.length; num2++){

                    if(array[num1] == array[num2]){

                        CantidadRepetidos++;

                    }


                }

                if(CantidadRepetidos > NumerosRepetidos){

                    NumerosRepetidos = CantidadRepetidos;

                    moda = array[num1];

                }else{


                        moda = 0;

                    
                }
            }

 //Impresion de resultados
            
    System.out.println("La moda es: " + moda);

    System.out.println("La mediana es: " + mediana);
    
    System.out.println("El promedio es: " + promedio);

        

        }
    
    }
}
