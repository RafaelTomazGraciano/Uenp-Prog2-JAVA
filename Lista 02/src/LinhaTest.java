import org.junit.jupiter.api.Test;

public class LinhaTest {
    @Test
    void TesteDesenhar(){
        Linha linha = new Linha();
        linha.comprimento = 10;
        linha.desenhar();
        Linha linha2 = new Linha(20);
        linha2.desenhar();
    }
}