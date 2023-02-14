import java.util.Scanner;

import java.util.Random;

public class Ejercicio3_DoWhile {

    public static void main(String[] args) {

        
    
    int NumeroDeProductos = 0;

    Scanner sc = new Scanner(System.in);
    Random numeroRandom = new Random();
    int datos = 0;
    
    NumeroDeProductos = (int)(numeroRandom.nextDouble() * 5);

    System.out.println("Tendras que digitar [" + (NumeroDeProductos) + "] productos para mostrarte una tabla y decirte cuanto es el total que deberas pagar");
    
    String[] TiposDeDatos = {"Nombre", "Cantidad", "Precio "};
    int[] NDP = new int[NumeroDeProductos];

    if(NumeroDeProductos == 0){

        System.out.println("No hay productos para calcular");

        System.exit(0);

    }
    
    String NombreDelProducto = "";
    int PrecioDelProducto = 0;
    int CantidadDelProducto = 0;

    do{


        System.out.println("Digite el nombre del producto: ");

        NombreDelProducto = sc.nextLine();

        TiposDeDatos[datos] = NombreDelProducto;

        System.out.println("Digite la cantidad del producto: ");

        CantidadDelProducto = sc.nextInt();

        TiposDeDatos[datos] = Integer.toString(CantidadDelProducto);

        System.out.println("Digite el precio del producto: ");

        PrecioDelProducto = sc.nextInt();

        TiposDeDatos[datos] = Integer.toString(PrecioDelProducto);

        datos++;
        


         } while ( datos < NDP.length);

            datos = 0;

            do{

                System.out.println(NombreDelProducto + "" + CantidadDelProducto + "" + PrecioDelProducto);

                datos++;

            } while (datos > NDP.length);


}

}