public class EmpleadoTiempoParcial extends Empleado {
    private int horasTrabajadas ;
    public EmpleadoTiempoParcial(String nombre, String puesto , double salario ,int id, int horasTrabajadas) {
        super(nombre , puesto , salario ,id);
        this . horasTrabajadas = horasTrabajadas ;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas ;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this . horasTrabajadas = horasTrabajadas ;
    }
    @Override
    public double getSalario () {
        // Logica diferente para calcular salario basado en horas trabajadas
        return super. getSalario () * horasTrabajadas / 40;
    }
}
