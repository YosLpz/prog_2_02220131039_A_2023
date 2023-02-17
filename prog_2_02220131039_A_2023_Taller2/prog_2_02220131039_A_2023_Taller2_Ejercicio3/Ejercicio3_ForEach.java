import java.util.Scanner;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Ejercicio3_ForEach {

    public static void main(String[] args) {

        
    
    int NumeroDeProductos = 0;

    Scanner sc = new Scanner(System.in);
    Random numeroRandom = new Random();
    int D = 0;
    
    NumeroDeProductos = (int)(numeroRandom.nextDouble() * 23);

    System.out.println("Tendras que digitar [" + (NumeroDeProductos) + "] productos para mostrarte una tabla y decirte cuanto es el total que deberas pagar");
    
    String[] Datos = new String[NumeroDeProductos];
    int[] Cantidad = new int[NumeroDeProductos];
    int[] Precio = new int[NumeroDeProductos];

        if (NumeroDeProductos == 0) {
            System.out.println("No hay productos para mostrar");

            System.exit(0);
        }

        for     (int x : Cantidad )  {
            System.out.println("Digite el nombre del producto");

            Datos[D] = sc.nextLine();

            System.out.println("Digite la cantidad del producto");

            Cantidad[D] = sc.nextInt();

            System.out.println("Digite el precio del producto");

            Precio[D] = sc.nextInt();

            sc.nextLine();

            D++;
        }
        
      DefaultTableModel modelo = new DefaultTableModel();

      JTable TablaDeProductos = new JTable(modelo);

        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");

        D = 0;

    for ( int i : Cantidad) {
            Object[] Posicionamiento = new Object[3];

            Posicionamiento[0] = Datos[D];

            Posicionamiento[1] = Cantidad[D];

            Posicionamiento[2] = Precio[D];

            modelo.addRow(Posicionamiento);

            D++;
            }

        JFrame P = new JFrame("Tabla de productos");

        P.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        P.add(new JScrollPane(TablaDeProductos));

        P.pack();

        P.setVisible(true);

}

}