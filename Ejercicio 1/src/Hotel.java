public class Hotel {
    private String nombre;
    public Hotel(String nombre) {
        this.nombre = nombre;
    }
    public void hacerReserva() {
        System.out.println("Reserva exitosa en el hotel " + this.nombre);
    }
    public String getNombre() {
        return this.nombre;
    }
}
