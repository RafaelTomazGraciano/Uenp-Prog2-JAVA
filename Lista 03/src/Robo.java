/*Crie uma classe chamada Robo, que simula um robô. A classe deve ter um
campo, do tipo String, com o nome do robô e um campo do tipo Ponto, que
representa a posição do Robo no plano cartesiano. A classe deve ter
a) um construtor parametrizado que recebe o nome do robô e um Ponto
b) um construtor vazio
Um robô pode andar para direita (x é incrementado), andar para esquerda (x
é decrementado), andar para baixo (y é decrementado) e andar para cima (y
é incrementado). Um robô pode, também, se teletransportar para uma
coordenada específica. Um robô também deve saber informar sua posição
(um método que retorna a coordenada em que está).
Crie métodos adequados para essas ações do robô.*/

public class Robo {

    private  String nome;
    private Ponto ponto;

    public Robo(){
        nome = "";
        ponto = new Ponto(0,0);
    }

    public Robo(String nome, Ponto ponto){
        this.nome = nome;
        this.ponto = ponto;
    }

    public String getCoordenada(){
        return ponto.getX() + "e" + ponto.getY();
    }

    public void andarDireita(){
        ponto.setX(ponto.getX() + 1);
    }

    public void andarEsquerda(){
        ponto.setX(ponto.getX() - 1);
    }

    public void andarCima(){
        ponto.setY(ponto.getY() + 1);
    }

    public void andarBaixo(){
        ponto.setY(ponto.getY() - 1);
    }

    public String mostrarPosicao(){
        return ("X = " + ponto.getX() + " Y = "+ ponto.getY());
    }

    public Ponto getPonto(){
        return ponto;
    }


    public boolean colidiu(Robo robo){
            if(robo.getPonto().getX() == this.ponto.getX() && robo.getPonto().getY() == this.ponto.getY()){
                return true;
            }
            else{
                return false;
            }
    }

}
