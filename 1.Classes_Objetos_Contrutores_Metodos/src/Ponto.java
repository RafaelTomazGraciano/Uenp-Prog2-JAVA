/*Crie uma classe Ponto, que representa um ponto no plano cartesiano.
a. A classe deve ter os atributos x e y (inteiros).
b. A classe deve ter um construtor vazio que atribui o valor 0 a x e y.
c. A classe deve ter outro construtor parametrizado que recebe os valores de x
e y por meio de parâmetros.
d. A classe deve ter o método plotar(), que mostra os valores de x e y na
tela. Exemplo: suponha que x tenha o valor 7 e y o valor 9, então a saída
será:
x = 7, y = 9
e. A classe deve ter o método setarXY() que recebe os valores de x e y por
meio de parâmetros.*/


public class Ponto {
    int x, y;

    Ponto(){
        x = 0;
        y = 0;
    }

    Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }

    void plotar(){
        System.out.printf("x = %d, y = %d\n", x, y);
    }

    void setarXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Ponto p1 = new Ponto();
        p1.plotar();
        Ponto p2 = new Ponto(7,9);
        p2.plotar();
        p2.setarXY(3,7);
        p2.plotar();
    }
}
