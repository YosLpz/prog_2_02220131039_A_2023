import java.util.Scanner;

public class Punto2Parcial {
    
    public static void main(String[] args){

        int dia;
        int mes;
        int año;
        int diastranscurridos = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el dia: ");
        dia = sc.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = sc.nextInt();
        System.out.println("Ingrese el año: ");
        año = sc.nextInt();
        
        if(mes == 1){
            diastranscurridos = dia;
        }
        if(mes == 2){
            diastranscurridos = dia + 31;
        }
        if(mes == 3){
            diastranscurridos = dia + 59;
        }
        if(mes == 4){
            diastranscurridos = dia + 90;
        }
        if(mes == 5){
            diastranscurridos = dia + 120;
        }
        if(mes == 6){
            diastranscurridos = dia + 151;
        }
        if(mes == 7){
            diastranscurridos = dia + 181;
        }
        if(mes == 8){
            diastranscurridos = dia + 212;
        }
        if(mes == 9){
            diastranscurridos = dia + 243;
        }
        if(mes == 10){
            diastranscurridos = dia + 273;
        }
        if(mes == 11){
            diastranscurridos = dia + 304;
        } 
        if(mes == 12){
            diastranscurridos = dia + 334;

        }
        
        if(año % 4 == 0){
            diastranscurridos = diastranscurridos + 1;
        }
        
        diastranscurridos -= 1;

        
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if(dia > 31){
                System.out.println("El dia ingresado no es valido");
            }else{
                System.out.println("La fecha ingresada es valida");
                System.out.println("La cantidad de dias transcurridos desde el 1 de enero son: " + diastranscurridos);
            }
        }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            if(dia > 30){
                System.out.println("El dia ingresado no es valido");
            }else{
                System.out.println("La fecha ingresada es valida");
                System.out.println("La cantidad de dias transcurridos desde el 1 de enero son: " + diastranscurridos);
            }
        }else if(mes == 2){
            if(año % 4 == 0){
                if(dia > 29){
                    System.out.println("El dia ingresado no es valido");
                }else{
                    System.out.println("La fecha ingresada es valida");
                    System.out.println("La cantidad de dias transcurridos desde el 1 de enero son: " + diastranscurridos);
                }
            }else{
                if(dia > 28){
                    System.out.println("El dia ingresado no es valido");
                }else{
                    System.out.println("La fecha ingresada es valida");
                    System.out.println("La cantidad de dias transcurridos desde el 1 de enero son: " + diastranscurridos);
                }
            }

        


    }

}
}
