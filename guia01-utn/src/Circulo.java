public class Circulo {
    protected double radio;
    protected String color;

    public Circulo(){
        this.radio = 1.0;
        this.color = "rojo";
    }

    public Circulo(double radio, String color){
        this.radio = radio;
        this.color = color;
    }

    public double calcularArea(){
        return Math.PI * radio * radio;
    }

    @Override
    public String toString(){
        return "Circulo[radio=" + radio + ", color=" + color + "]";
    }
}
