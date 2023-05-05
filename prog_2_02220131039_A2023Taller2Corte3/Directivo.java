public class Directivo extends Empleado{

    public Directivo(String nombre, int sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public String toString() {
        return "Empleado -> Directivo{ Nombre " + getNombre() + " Sueldo " + getSueldo() + '}';
    }

    @Override
    public void aumentarSueldo() {
       setSueldo((int) (getSueldo() * 1.4));
    }

    
}
