import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
     void calculadoratest() {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.calculadora("SOM", 1,10,50,20,17,35));
        System.out.println(calculadora.calculadora("MULT", 1,5,10,7,-7));
    }
}
