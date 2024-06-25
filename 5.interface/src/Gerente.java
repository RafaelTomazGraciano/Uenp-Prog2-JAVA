public class Gerente implements Funcionario {

    double salarioMes;

    Gerente(){
        salarioMes = 0.0;
    }

    Gerente(double salarioMes){
        this.salarioMes = salarioMes;
    }

    @Override
    public double calcularSalario(){
        return salarioMes * 1.1;
    }


}
