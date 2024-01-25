package Classes;

import Enums.Actions;
import Enums.Places;
import Interfaces.*;
import Enums.*;
import Classes.*;
import Abstract.Character;

public class Baby extends Character implements SimpleInterface, Knowable, Laughable, Believable, Fireable {
    public Baby(){
        this.name = "Малыш";
        this.age = 7;
    }
    public Baby(String name){
        super(name);
    }
    public Baby(String name, int age){
        super(name, age);
    }
    @Override
    public void know(){
        this.setState(Actions.KNEW + " чей Бимбо, ");
    }
    @Override
    public void laugh(){
        this.setState(Actions.LAUGH + ": ");
    }
    @Override
    public void believe(){
        this.setState(" ему охотно"+ Actions.BELIEVE +" ");
    }
    @Override
    public void fire(){
        this.setState(Actions.FIRED + " от желания" + Actions.KNOW + " как");
    }

}