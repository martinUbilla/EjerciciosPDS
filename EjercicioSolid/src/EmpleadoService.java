public class EmpleadoService implements IEmpleadoService {
    private IEmpleadoDAO empleadoDAO;
    public EmpleadoService(IEmpleadoDAO empleadoDAO) {
        this .empleadoDAO = empleadoDAO;
    }
    @Override
    public Empleado obtenerEmpleado(int id) {
        return empleadoDAO.obtenerEmpleado(id);
    }
    @Override
    public void actualizarEmpleado(Empleado empleado) {
        empleadoDAO. actualizarEmpleado(empleado );
    }
    @Override
    public void agregarEmpleado(Empleado empleado) {empleadoDAO.agregarEmpleado(empleado);}
    @Override
    public void eliminarEmpleado(int id) { empleadoDAO.eliminarEmpleado(id);}
}
