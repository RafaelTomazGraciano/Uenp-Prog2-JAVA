import org.junit.jupiter.api.Test;

public class ObjetosTest {
    @Test
    public void test() {
        Objetos objetos = new Objetos();
        System.out.println(Objetos.quantidadeObjetos());
        for(int i = 0; i < 10; i++) {
            new Objetos();
        }
        System.out.println(Objetos.quantidadeObjetos());
    }
}
