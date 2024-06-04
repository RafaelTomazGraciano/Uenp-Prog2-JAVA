import org.junit.jupiter.api.Test;

class CarroTest {
    @Test
    void test(){
        Carro carro = new Carro("Civic", "Honda", 2024);
        for (int i =0; i < 210; i++){
            System.out.println(carro.acelerar());
        }
        for(int i =0; i < 210; i++){
            System.out.println(carro.frear());
        }
    }

}