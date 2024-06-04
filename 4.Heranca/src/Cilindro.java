public class Cilindro extends Circulo{

    private double altura;

    public Cilindro(){
        super();
        altura = 0;
    }

    public Cilindro(double raio, double altura){
        super(raio);
        this.altura = altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }

    public double calcularArea(){
        return (Math.PI * 2 * Math.pow(getRaio(), 2)) + (2*Math.PI * getRaio() * altura);
    }

}
