public class Circulo {
    private double raio;

    public Circulo(){
        raio = 0.0;
    }

    public Circulo(double raio){
        this.raio = raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }

    public double calcularArea(){
        return Math.PI * raio * raio;
    }

}
