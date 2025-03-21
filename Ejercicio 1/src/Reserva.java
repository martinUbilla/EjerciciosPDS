public class Reserva {
    private Hotel hotel;
    private Cliente cliente;
    private SistemaCredito sistemaCredito;
    private SistemaDebito sistemaDebito;
    private boolean estado;

    public Reserva(Hotel hotel, Cliente cliente,String metodo) {
            this.hotel = hotel;
            this.cliente = cliente;
            reservar(cliente,metodo);
    }
    private void reservar(Cliente cliente, String tarjeta) {
        if(tarjeta.equalsIgnoreCase("Debito")) {
            this.sistemaDebito = SistemaDebito.getInstance();
            this.sistemaDebito.pagar(cliente);
            hotel.hacerReserva();
            this.estado = true;
        }else if(tarjeta.equalsIgnoreCase("Credito")) {
            this.sistemaCredito = SistemaCredito.getInstance();
            sistemaCredito.pagar(cliente);
            hotel.hacerReserva();
            this.estado = true;
        }

    }
    public void cancelarReserva() {
        this.estado = false;
        System.out.println("Reserva cancelada del cliente " + cliente.getNombre());
        System.out.println("Reserva cancelada en el hotel " + hotel.getNombre());
    }


}
