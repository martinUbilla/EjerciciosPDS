import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoDAO implements IEmpleadoDAO {
    ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    Iprint iprint = new Print() ;
    // Aqui se implementa la logica para manejar empleados en memoria o base de datos
    @Override
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        // Implementar
    }
    @Override
    public Empleado obtenerEmpleado(String nombre) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals(nombre)) {
                return empleado;
            }
        }
        // Implementar
        return null ;
    }
    @Override
    public void eliminarEmpleado(String nombre) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals(nombre)) {
                empleados.remove(empleado);
                break;
            }
        }
        // Implementar
    }
    @Override
    public void actualizarEmpleado(Empleado empleado) {
        System.out.println("Ingrese nuevo salario del empleado:");
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        empleado.setSalario(salario);
        sc.nextLine();
        System.out.println("Ingrese nuevo puesto del empleado:");
        String puesto = sc.nextLine();
        empleado.setPuesto(puesto);
        // Implementar
    }
}
