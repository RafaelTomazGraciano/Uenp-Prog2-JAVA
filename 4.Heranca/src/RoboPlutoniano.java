public class RoboPlutoniano extends RoboMarciano{
    private int quantidadeBalas;

    RoboPlutoniano(){
        super();
        quantidadeBalas = 0;
    }

    public void atirar(){
        if(quantidadeBalas > 0){
            quantidadeBalas--;
        }
    }

    public void recarregar(int recarrega){
        quantidadeBalas += recarrega;
    }

    public int getQuantidadeBalas() {
        return quantidadeBalas;
    }

    public void setQuantidadeBalas(int quantidadeBalas) {
        this.quantidadeBalas = quantidadeBalas;
    }

    @Override
    public String toString(){
        return "Sou um robô Plutoniano";
    }
}
