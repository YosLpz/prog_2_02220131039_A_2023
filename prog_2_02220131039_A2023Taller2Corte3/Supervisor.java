public class Supervisor extends Operario {

    public Supervisor(String nombre, int sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public String toString() {
        return "Empleado -> Supervisor -> Operario { Nombre " + getNombre() + " Sueldo " + getSueldo() + '}';
    }

    @Override
    public void aumentarSueldo() {
        setSueldo((int) (getSueldo() * 1.6));
    }

    
}
