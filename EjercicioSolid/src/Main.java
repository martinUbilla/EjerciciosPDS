//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado emp = new Empleado("pepe","Secretario" , 300,123);
        Empleado emp2 = new Empleado("pepe2","Secretario" , 300,1234);
        IEmpleadoService empDAO = new EmpleadoService(new EmpleadoDAO());
        empDAO.agregarEmpleado(emp);
        empDAO.agregarEmpleado(emp2);
        System.out.println(emp.getNombre() + " Puesto:" + emp.getPuesto() + " Salario:" + emp.getSalario());
        empDAO.actualizarEmpleado(emp);
        System.out.println(emp.getNombre() + " Puesto:" + emp.getPuesto() + " Salario:" + emp.getSalario());
    }
}