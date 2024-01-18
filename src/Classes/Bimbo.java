import Enums.Actions;
import Enums.Intruders;
import Interfaces.Knowable;
import Interfaces.Scarable;

public class Bimbo extends Character implements Knowable, Scarable {
    Bimbo(String name){
        super(name);
        this.name = name;
    }
    @Override
    public void know(){
        this.setState(this.getState() + " это тоже" + Actions.KNEW.toString() + ". ");
    }
    @Override
    public void scare(Intruders in1, Intruders in2){
        this.setState(Actions.SCARE.toString() + " бешеным лаем " + in1.toString() + " " + in2.toString());
    }
}