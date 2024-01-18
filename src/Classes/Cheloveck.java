import Enums.Actions;
import Interfaces.Knowable;

public class Cheloveck extends Character implements Knowable {
    Cheloveck(String name){
        super(name);
        this.name = name;
    }
    public void know(){
        setState(" должен был" + Actions.KNOW.toString() + " ,что ");
    }
}