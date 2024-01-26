package Classes;

import Interfaces.*;
import Enums.*;
import Abstract.Character;


public class Bimbo extends Character implements Knowable, Scarable, NameGetter {
    public Bimbo(){
        this.name = "Бимбо";
    }
    public Bimbo(String name){
        super(name);
    }
    public Bimbo(String name, int age){
        super(name, age);
    }
    @Override
    public void know(){
        this.setState(this.getState() + " это тоже" + Actions.KNEW);
    }
    @Override
    public void scare(Intruders in1, Intruders in2){
        this.setState(Actions.SCARE + " бешеным лаем " + in1 + " и " + in2);
    }
}