import java.util.Scanner;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Ejercicio3_DoWhile {

    public static void main(String[] args) {

        
    
    int NumeroDeProductos = 0;

    Scanner sc = new Scanner(System.in);
    Random numeroRandom = new Random();
    int datos = 0;
    
    NumeroDeProductos = (int)(numeroRandom.nextDouble() * 23);

    System.out.println("Tendras que digitar [" + (NumeroDeProductos) + "] productos para mostrarte una tabla y decirte cuanto es el total que deberas pagar");
    
    String[] Datos = new String[NumeroDeProductos];
    int[] Cantidad = new int[NumeroDeProductos];
    int[] Precio = new int[NumeroDeProductos];

        if (NumeroDeProductos == 0) {
            System.out.println("No hay productos para mostrar");

            System.exit(0);
        }

        do {
            System.out.println("Digite el nombre del producto");

            Datos[datos] = sc.nextLine();

            System.out.println("Digite la cantidad del producto");

            Cantidad[datos] = sc.nextInt();

            System.out.println("Digite el precio del producto");

            Precio[datos] = sc.nextInt();

            sc.nextLine();
            datos++;

        } while (datos < NumeroDeProductos);
        
      DefaultTableModel modelo = new DefaultTableModel();

      JTable TablaDeProductos = new JTable(modelo);

        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");

        datos = 0;

            do {
            Object[] Posicionamiento = new Object[3];
            Posicionamiento[0] = Datos[datos];
            Posicionamiento[1] = Cantidad[datos];
            Posicionamiento[2] = Precio[datos];
            modelo.addRow(Posicionamiento);

            datos++;
            }while (datos < NumeroDeProductos);

            JFrame ventana = new JFrame("Tabla de productos");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.add(new JScrollPane(TablaDeProductos));
            ventana.pack();
            ventana.setVisible(true);

}

}