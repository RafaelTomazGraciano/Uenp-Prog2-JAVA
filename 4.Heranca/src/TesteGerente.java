public class TesteGerente {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Funcionario", 1, 10000);
        Gerente gerente = new Gerente("Gerente", 2, 20000, 2500);
        System.out.println(funcionario.mostrarSalario(500));
        System.out.println(gerente.mostrarSalario(1000));
    }
}
