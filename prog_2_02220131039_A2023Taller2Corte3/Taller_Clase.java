public class Taller_Clase {
    
    
    public static void main(String[] args){

        Empleado[] empleados = new Empleado[7];

        empleados[0] = new Empleado("Juan", 1000);
        empleados[1] = new Operario("Pedro", 1000);
        empleados[2] = new Tecnico("Maria", 1000);
        empleados[3] = new Supervisor("Ana", 1000);
        empleados[4] = new Directivo("Luis", 1000);
        empleados[5] = new Secretaria("Carlos", 1000);
        empleados[6] = new Gerente("Jose", 1000);


        for (Empleado empleado : empleados) {
            empleado.aumentarSueldo();
        }

        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }


    }
}
