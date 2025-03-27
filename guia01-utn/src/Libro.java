public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;

    public Libro(String titulo, Autor autor, double precio, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.stock = stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void aumentarStock(int cantidad) {
        this.stock += cantidad;
    }

    public void imprimirDetalles() {
        System.out.println("El libro, " + titulo + " de " + autor.toString() + ". Se vende a " + precio + " pesos.");
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + " - " + autor.toString() + " - Precio: " + precio + " - Stock: " + stock;
    }
}
