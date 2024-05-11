import org.junit.jupiter.api.Test;

class RoboTest {
     @Test
     void roboTest() {
        Robo robo = new Robo("robo", new Ponto(0,0));
        for(int i = 0; i < 10; i++){
            System.out.println(robo.mostrarPosicao());
            robo.andarDireita();
            robo.andarCima();
        }
        System.out.println(robo.mostrarPosicao());
        System.out.println(robo.getCoordenada());

        for(int i = 0; i < 20; i++){
            System.out.println(robo.mostrarPosicao());
            robo.andarEsquerda();
            robo.andarBaixo();
        }

         System.out.println(robo.colidiu(new Robo("robo2", new Ponto(-10,-10))));

    }
}
