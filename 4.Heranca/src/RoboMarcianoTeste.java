public class RoboMarcianoTeste {
    public static void main(String[] args) {
        RoboMarciano robo = new RoboMarciano();
        robo.teletransportar(10,5);
        System.out.println(robo.getPontoX());
        System.out.println(robo.getPontoY());
        System.out.println(robo.toString());
    }
}
