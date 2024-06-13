public class RoboPlutonianoTeste {
    public static void main(String[] args) {
        RoboPlutoniano robo = new RoboPlutoniano();
        robo.recarregar(15);
        robo.atirar();
        System.out.println(robo.getQuantidadeBalas());
        System.out.println(robo.toString());
    }
}
