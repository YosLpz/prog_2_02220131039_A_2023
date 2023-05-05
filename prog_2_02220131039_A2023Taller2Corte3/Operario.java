public class Operario extends Empleado {
    

    public Operario(String nombre, int sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public String toString() {
        return "Empleado -> Operario{ Nombre " + getNombre() + " Sueldo " + getSueldo() + '}';

    }


    @Override
    public void aumentarSueldo() {
        setSueldo((int) (getSueldo() * 1.4));        
    }





    

}
