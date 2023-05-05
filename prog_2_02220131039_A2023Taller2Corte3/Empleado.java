
public class Empleado{

    private String nombre;

    private int sueldo;

    public Empleado(String nombre, int sueldo){

        this.nombre = nombre;

        this.sueldo = sueldo;

    }

    public String getNombre(){

        return nombre;

    }

    public void setNombre(String nombre){

        this.nombre = nombre;

    }

    public int getSueldo(){

        return sueldo;

    }

    public void setSueldo(int sueldo){

        this.sueldo = sueldo;

    }

    public String toString(){

        return "Empleado{" + " Nombre " + nombre + " Sueldo " + sueldo + '}';

    }


    public void aumentarSueldo(){

        this.sueldo = (int) (this.sueldo * 1.2);

    }

    

    



}

