abstract class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public abstract double calcularPago();

    @Override
    public String toString() {
        return "Empleado: " + nombre + " - Pago: " + calcularPago();
    }
}
class EmpleadoTiempoCompleto extends Empleado{
    public EmpleadoTiempoCompleto(String nombre, double salario){
        super(nombre, salario);
    }
    @Override
    public double calcularPago(){
        return salario;
    }
}

class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, double tarifaPorHora, int horasTrabajadas){
        super(nombre, tarifaPorHora * horasTrabajadas);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularPago(){
        return horasTrabajadas * tarifaPorHora;
    }
}

class EmpleadoContratista extends Empleado{
    private int horasTrabajadas;
    private double tarifaPorProyecto;

    public EmpleadoContratista(String nombre, int horasTrabajadas, double tarifaPorProyecto){
        super(nombre, horasTrabajadas*tarifaPorProyecto);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorProyecto = tarifaPorProyecto;
    }

    @Override
    public double calcularPago(){
        return horasTrabajadas*tarifaPorProyecto;
    }
}

