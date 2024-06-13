public abstract class Robo {
    private int codigo;
    private String nome;
    private Ponto ponto;

    Robo(){
        ponto = new Ponto();
        codigo = 0;
        nome = "";
    }

    Robo(int codigo, String nome, Ponto ponto){
        this.ponto = ponto;
        this.codigo = codigo;
        this.nome = nome;
    }

    public void andarFrente(){
        ponto.setX(ponto.getX() + 1);
    }

    public void andarTras(){
        ponto.setX(ponto.getX() - 1);
    }

    public void andarCima(){
        ponto.setY(ponto.getY() + 1);
    }

    public void andarBaixo(){
        ponto.setY(ponto.getY() - 1);
    }

    public int getPontoX(){
        return ponto.getX();
    }

    public void setPontoX(int x){
        ponto.setX(x);
    }

    public int getPontoY(){
        return ponto.getY();
    }

    public void setPontoY(int y){
        ponto.setY(y);
    }

}
