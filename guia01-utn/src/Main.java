public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pedrito", "E@EMAIL.COM", 10);
        Factura factura = new Factura(cliente, 1000.0);

        System.out.println(cliente);
        System.out.println(factura);

        System.out.println("------------------------------------------------------------------------");
        Cilindro cilindro1 = new Cilindro();
        System.out.println(cilindro1);
        System.out.println("Area: " + cilindro1.calcularArea());
        System.out.println("Volumen: " + cilindro1.calcularVolumen());

        Cilindro cilindro2 = new Cilindro(3.0,"azul",5.0);
        System.out.println(cilindro2);
        System.out.println("Area: "+ cilindro2.calcularArea());
        System.out.println("Volumen: "+cilindro2.calcularVolumen());
        System.out.println("------------------------------------------------------------------------");
        Persona[] personas = {
                new Estudiante("123","Ana","Gomez","email@mc.com","calle 2",2020, 5000,"Medicina"),
                new Estudiante("123","Ana","Gomez","email@mc.com","calle 2",2025, 4500,"Informatica"),
                new MiembroStaff("123","Ana","Gomez","email@mc.com","calle 2",2020, "Manana"),
                new MiembroStaff("123","Ana","Gomez","email@mc.com","calle 2",2020, "Noche")
        };

        int estudiantes = 0;
        double totalCuotas = 0;
        for (Persona p : personas){
            if(p instanceof Estudiante) {
                estudiantes++;
                totalCuotas += ((Estudiante) p).getCuotaMensual();
            }
        }
        System.out.println("Total estudiantes: " + estudiantes);
        System.out.println("Ingresos por cuotas: $" + totalCuotas);
    }
}
