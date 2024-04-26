import org.junit.jupiter.api.Test;

public class Programador2Test {
    @Test
    void test() {
        Programador2 programador = new Programador2("Rafael");
        System.out.println(programador.nome);
        System.out.println(programador.calculaSalario(2000, 20, 22.87));

    }
}
