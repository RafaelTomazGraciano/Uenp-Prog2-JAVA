public class RobosTeste {
    public static void main(String[] args) {
        Robo vetor[] = new Robo[3];
        vetor[0] = new RoboSolar();
        vetor[1] = new RoboMarciano();
        vetor[2] = new RoboPlutoniano();
        for(Robo r : vetor){
            System.out.println(r.toString());
        }
    }
}
