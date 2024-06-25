import java.util.Comparator;

public class SalarioComparator implements Comparator<Funcionario> {

    @Override
    public int compare(Funcionario func1, Funcionario func2){
        return Double.compare(func1.calcularSalario(), func2.calcularSalario());
    }

}
