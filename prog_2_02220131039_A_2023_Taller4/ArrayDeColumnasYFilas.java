import java.util.Scanner;

public class ArrayDeColumnasYFilas{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total= 0;
        int  TotalFila= 0;
        int TotalColumna = 0;
        int TotalTotal = 0;
        int[][] tabla = new int[4][5];

        System.out.println("Introduce 20 números enteros:");
        for (int i = 0; i < 4; i++) {
            for (int t = 0; t < 5; t++) {
                tabla[i][t] = sc.nextInt();
            }
        }

        for (int x = 0; x < 4; x++) {

            for (int o = 0; o < 5; o++) {

                System.out.print(tabla[x][o] + "\t");

                TotalFila += tabla[x][o];

                total += tabla[x][o];
            }
            System.out.print(TotalFila + "\n");
        }
        for (int z = 0; z < 5; z++) {

            for (int m = 0; m < 4; m++) {

                TotalColumna += tabla[m][z];

            }
            
            System.out.print(TotalColumna + "\t");
        }
        TotalTotal = total + TotalColumna + TotalFila;

        System.out.println(total + "\t" + TotalTotal);

    }
}
