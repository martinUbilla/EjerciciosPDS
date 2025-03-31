public class Empleado {
    private int id;
    private String nombre;
    private String puesto ;
    private double salario ;
    public Empleado(String nombre, String puesto , double salario, int id ) {
        this .nombre = nombre;
        this . puesto = puesto ;
        this . salario = salario ;
        this . id = id ;
    }
    public int getId() { return id; };
    public String getNombre() {
        return nombre;
    }
    public String getPuesto() {
        return puesto ;
    }
    public double getSalario () {
        return salario ;
    }
    public void setPuesto(String puesto) {
        this . puesto = puesto ;
    }
    public void setSalario (double salario ) {
        this . salario = salario ;
    }
}
