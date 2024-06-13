public class Pixel extends Ponto{

    private String cor;

    public Pixel(){
        super();
        cor = "preto";
    }

    public Pixel(int x, int y){
        super(x, y);
        cor = "preto";
    }

    public Pixel(int x, int y, String cor){
        super(x, y);
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

}
