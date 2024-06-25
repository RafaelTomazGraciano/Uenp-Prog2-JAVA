import java.util.ArrayList;
import java.util.Collections;

public class FolhaPagamento {


    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList();
        funcionarios.add(new Operario(37.5, 20));
        funcionarios.add(new Operario(23.75, 15));
        funcionarios.add(new Operario(20, 25));
        funcionarios.add(new Gerente(100));
        funcionarios.add(new Gerente(250));
        funcionarios.add(new Gerente(200));

        Collections.sort(funcionarios, new SalarioComparator());

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.calcularSalario());
        }

    }

}
