import java.util.UUID;

public class Cliente {
    private String id;
    private String nombre;
    private String email;
    private double descuento;

    public Cliente(String nombre, String email,double descuento){
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    public double getDescuento(){
        return descuento;
    }

    @Override
    public String toString(){
        return "Cliente[id=" + id + ", nombre=" + nombre + ", email=" + email + ", descuento=" + descuento + "%]";
    }
}
