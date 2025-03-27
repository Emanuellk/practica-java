import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {
    private String id;
    private LocalDateTime fecha;
    private double montoTotal;
    private Cliente cliente;

    public Factura(Cliente cliente, double montoTotal){
        this.id = UUID.randomUUID().toString();
        this.fecha = LocalDateTime.now();
        this.montoTotal = montoTotal;
        this.cliente = cliente;
    }

    public double calcularMontoFinal(){
        return montoTotal - (montoTotal * cliente.getDescuento() / 100);
    }

    @Override
    public String toString() {
        return "Factura[id=" + id + ", fecha=" + fecha + ", monto=" + montoTotal +
                ", montoDesc=" + calcularMontoFinal() + ", " + cliente.toString() + "]";
    }
}
