public class Gerente extends Funcionario {

    private double gratificacao;

    public Gerente(){
        super();
        gratificacao = 0.0;
    }

    public Gerente(String nome, int codigo, double salario, double gratificacao){
        super(nome, codigo, salario);
        this.gratificacao = gratificacao;
    }

    public void setGratificacao(double gratificacao){
        this.gratificacao = gratificacao;
    }

    public double getGratificacao(){
        return gratificacao;
    }

    public double mostrarSalario(double descontos){
        return getSalario() - descontos + gratificacao;
    }

}