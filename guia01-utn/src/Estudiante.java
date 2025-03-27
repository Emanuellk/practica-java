public class Estudiante extends Persona {
    private int anioIngreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiante(String dni, String nombre, String apellido, String email, String direccion,
                      int anioIngreso, double cuotaMensual, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.anioIngreso = anioIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }
}