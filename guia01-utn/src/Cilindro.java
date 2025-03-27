public class Cilindro extends Circulo{
    private double altura;

    public Cilindro(){
        super();
        this.altura = 1.0;
    }

    public Cilindro(double radio, String color, double altura){
        super(radio, color);
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return 2 * Math.PI * radio * altura + 2 * super.calcularArea();
    }

    public double calcularVolumen(){
        return super.calcularArea() * altura;
    }

    @Override
    public String toString(){
        return "Cilindro: subclase de " + super.toString() + ", altura=" + altura;
    }
}
