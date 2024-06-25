public class RoboMarciano extends Robo{

    public void teletransportar(int x, int y){
        setPontoX(x);
        setPontoY(y);
    }

    @Override
    public String toString(){
        return "Sou um robô Marciano";
    }

    public void resetar(){
        setPontoX(0);
        setPontoX(0);
    }
}
