public class Operario implements Funcionario {

    double salarioDia;
    int diasTrabalhados;

    Operario(){
        salarioDia = 0.0;
        diasTrabalhados = 0;
    }

    Operario(double salarioDia, int diasTrabalhados){
        this.salarioDia = salarioDia;
        this.diasTrabalhados = diasTrabalhados;
    }

    @Override
    public double calcularSalario(){
        return salarioDia * diasTrabalhados;
    }

    public double getSalarioDia() {
        return salarioDia;
    }

    public void setSalarioDia(double salarioDia) {
        this.salarioDia = salarioDia;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }


}
