import org.junit.jupiter.api.Test;

public class ProgramadorTest {
    @Test
    void TestecalcularSalario(){
        Programador programador = new Programador(50,22.77);
        System.out.println("Salario: "+ programador.calcularSalario());
    }
}