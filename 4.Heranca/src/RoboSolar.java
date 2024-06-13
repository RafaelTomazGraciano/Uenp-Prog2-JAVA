public class RoboSolar extends Robo{
    private boolean emitieRaios;

    RoboSolar(){
        super();
        emitieRaios = false;
    }

    public boolean getEmiteRaios(){
        return emitieRaios;
    }

    public void setEmiteRaios(boolean emitieRaios){
        this.emitieRaios = emitieRaios;
    }

    @Override
    public String toString(){
        return "Sou um robô Solar";
    }

}
