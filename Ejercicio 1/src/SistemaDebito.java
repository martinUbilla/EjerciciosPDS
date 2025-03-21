

public class SistemaDebito implements SistemaDePago {
    private static SistemaDebito instance;
    private SistemaDebito (){
    }
    public static SistemaDebito getInstance(){
        if(instance == null){
            instance = new SistemaDebito();
        }
        return instance;
    }
    @Override
    public void pagar(Cliente cliente) {
        System.out.println("Pagando cliente: " + cliente.getNombre() + " con tarjeta Debito");
    }
}
