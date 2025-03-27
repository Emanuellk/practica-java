public class MiembroStaff extends Persona {
    private double salario;
    private String turno;

    public MiembroStaff(String dni, String nombre, String apellido, String email, String direccion,
                        double salario, String turno) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }
}