import java.util.Scanner;


public class CompañiaTelefonica {

    public static void main(String[] args){


        int minutos = 0;
        double costo = 0;
        String dia = " ";
        char hora = ' ';
        double costoconimpuestos = 0;



        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de minutos: ");
        minutos = sc.nextInt();
        System.out.println("Ingrese el dia de la semana: ");
        dia = sc.next();
        System.out.println("Ingrese la hora (M para mañana, T para tarde o N para noche): ");
        hora = sc.next().charAt(0);
        

        if (minutos <= 5){
           costo = 1;
        }
        else if (minutos <= 8){
            costo = 80;
        }
        else if (minutos <= 10){
            costo = 70;
        }
        else if(minutos >= 11){
            costo = 50;
        }
        else {
            System.out.println("La cantidad de minutos no es valido");
            System.exit(0);
        }


        if (dia == "Domingo"){
            
            costoconimpuestos = costo * 0.3 ;

            costo = costo + costoconimpuestos;
            System.out.println("El precio a pagar seria de " + costo + " euros");
            System.exit(0);
        }
        
        if (hora == 'M'){

            costoconimpuestos = costo * 0.15;

            costo = costo + costoconimpuestos;
            System.out.println("El precio a pagar seria de " + costo + " euros");
            System.exit(0);
        }
        else if (hora == 'T'){

            costoconimpuestos = costo * 0.10;

            costo = costo + costoconimpuestos;
            System.out.println("El precio a pagar seria de " + costo + " euros");
            System.exit(0);
        }
        else if (hora == 'N'){
            System.out.println("El precio a pagar seria de " + costo + " euros");
            System.exit(0);
        }
        else {
            System.out.println("la hora no es valido");
            System.exit(0);
                

        }
     
        }
    }


