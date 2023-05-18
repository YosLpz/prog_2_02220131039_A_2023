import java.util.Scanner;


public class DescuentoDel15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Pedido = 0;
        int PedidoConDescuento = 0;
        int PedidoTotal = 0 ;

        try{
            System.out.println("Escriba el valor de su pedido");

            Pedido = sc.nextInt();

            PedidoConDescuento = (int) ((Pedido) * 0.15);

            PedidoTotal = (Pedido - PedidoConDescuento);

            System.out.println("El valor de su pedido con el descuento del 15% es de: " + PedidoTotal);
        }
        catch(Exception e){
            System.out.println("Haz cometido un error, vuelve a intentarlo");
            
            main(args);
        
        }
        
    }
}
