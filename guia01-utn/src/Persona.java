public class Persona {
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String direccion;

    public Persona(String dni, String nombre, String apellido, String email, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " - DNI: " + dni;
    }
}
