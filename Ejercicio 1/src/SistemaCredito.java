public class SistemaCredito implements SistemaDePago{
    private static SistemaCredito instance;
    private SistemaCredito(){
    }
    public static SistemaCredito getInstance(){
        if(instance == null){
            instance = new SistemaCredito();
        }
        return instance;
    }


    @Override
    public void pagar(Cliente cliente) {
        System.out.println("Pagando cliente: " + cliente.getNombre() + " con tarjeta Credito");
    }
}
