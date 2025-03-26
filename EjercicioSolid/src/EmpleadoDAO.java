import java.util.ArrayList;

public class EmpleadoDAO implements IEmpleadoDAO {
    ArrayList<Empleado> empleados = new ArrayList<Empleado>();
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
        // Implementar
    }
}
