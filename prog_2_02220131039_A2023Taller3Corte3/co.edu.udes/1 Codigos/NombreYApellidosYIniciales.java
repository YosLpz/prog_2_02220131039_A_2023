import java.util.Scanner;
public class NombreYApellidosYIniciales {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        String apellido = "";

        String iniciales = "";
        
        try{
        System.out.println("Escriba su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Escriba suapellido: ");
        apellido = sc.nextLine();

        
        iniciales = nombre.substring(0,1) + apellido.substring(0, 1);
        
        System.out.println("Sus iniciales son: " + iniciales);
    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        
        main(args);
    
    }
    }

}
