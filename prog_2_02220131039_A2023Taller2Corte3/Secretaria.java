public class Secretaria extends Directivo{

    public Secretaria(String nombre, int sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public String toString() {
        return "Empleado -> Secretaria -> Directivo { Nombre " + getNombre() + " Sueldo " + getSueldo() + '}';
    }

    @Override
    public void aumentarSueldo() {
        setSueldo((int) (getSueldo() * 1.6));
    }

    
}
