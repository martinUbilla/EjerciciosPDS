public interface IEmpleadoDAO {
    void agregarEmpleado(Empleado empleado);
    Empleado obtenerEmpleado(int id);
    void eliminarEmpleado(int id);
    void actualizarEmpleado(Empleado empleado );
}
