/*Crie uma classe chamada Ponto, com campos x e y, que representam uma
coordenada no plano cartesiano. Os campos devem ser privados com
métodos get() e set() para cada um. Crie um construtor parametrizado e um
construtor vazio.*/

public class Ponto{

    private int x;
    private int y;

    public Ponto(){
        x = 0;
        y = 0;
    }

    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }


}