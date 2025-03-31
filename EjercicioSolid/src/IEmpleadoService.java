public interface IEmpleadoService {
    Empleado obtenerEmpleado(int id);
    void actualizarEmpleado(Empleado empleado );
    void eliminarEmpleado(int id);
    void agregarEmpleado(Empleado empleado);
}
