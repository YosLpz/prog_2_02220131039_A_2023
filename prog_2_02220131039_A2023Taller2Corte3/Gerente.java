public class Gerente extends Directivo{
    
    public Gerente(String nombre, int sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public String toString() {
        return "Empleado -> Gerente -> Directivo { Nombre " + getNombre() + " Sueldo " + getSueldo() + '}';
    }

    @Override
    public void aumentarSueldo() {
        setSueldo((int) (getSueldo() * 1.6));
    }
 
}
