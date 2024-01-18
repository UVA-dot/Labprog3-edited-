import Enums.Actions;
import Interfaces.*;

public class Baby extends Character implements SimpleInterface, Knowable, Laughable, Believable, Fireable {
    Baby(String name){
        super(name);
        this.name = name;
    }
    @Override
    public void know(){
        this.setState(Actions.KNEW.toString() + " чей Бимбо, ");
    }
    @Override
    public void laugh(){
        this.setState(Actions.LAUGH.toString() + ": ");
    }
    @Override
    public void believe(){
        this.setState(" ему охотно"+ Actions.BELIEVE.toString() +" ");
    }
    @Override
    public void fire(){
        this.setState(Actions.FIRED.toString() + " от желания" + Actions.KNOW.toString() + " как");
    }

}