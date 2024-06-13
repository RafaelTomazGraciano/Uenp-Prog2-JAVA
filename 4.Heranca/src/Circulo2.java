public class Circulo2{
    private Ponto ponto;
    private double raio;

    public Circulo2(){
        ponto = new Ponto(0,0);
        raio = 1.0;
    }

    public Circulo2(int x, int y, double raio){
        this.ponto = new Ponto(x, y);
        this.raio = raio;
    }

    public String desenhar(){
        return "Circulo com raio " + raio;
    }

    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

}
