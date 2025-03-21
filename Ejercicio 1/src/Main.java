//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan perez", "1234-5678-9012-3456");
        Hotel hotel = new Hotel("Solari");
        Reserva r1 = new Reserva(hotel,cliente,"credito");
        r1.cancelarReserva();

    }
}