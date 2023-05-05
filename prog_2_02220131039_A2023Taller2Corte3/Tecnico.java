public class Tecnico extends Operario{


    public Tecnico(String nombre, int sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public String toString() {
        return "Empleado -> Tenico -> Operario{ Nombre " + getNombre() + " Sueldo " + getSueldo() + '}';
    }

    @Override
    public void aumentarSueldo() {

        
        setSueldo((int) (getSueldo() * 1.6));
    }

}
