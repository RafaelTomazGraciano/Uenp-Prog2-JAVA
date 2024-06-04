public class TesteCilindro {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println(circulo.calcularArea());
        Cilindro cilindro = new Cilindro(5, 7);
        System.out.println(cilindro.calcularArea());
    }
}
