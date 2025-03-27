public class Autor {
    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    public Autor(String nombre, String apellido, String email, char genero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }

    @Override
    public String toString(){
        return nombre + " " + apellido + " (" + email + ") - Genero: " + genero;
    }
}
