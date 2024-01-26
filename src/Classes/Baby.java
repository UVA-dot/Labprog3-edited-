package Classes;

import Enums.*;
import Interfaces.*;
import Abstract.Character;

public class Baby extends Character implements NameGetter, Knowable, Laughable, Believable, Fireable, GetSmartable {
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
        this.setState(Actions.KNEW + " чей Бимбо");
    }
    @Override
    public void laugh(){
        this.setState(String.format("%s", Actions.LAUGH));
    }
    public void sendSomeone(String chr, Places place){
        this.cur_state = String.format("Отправлять %s из %s", chr, place);
    }
    public void takeSomeone(Places place, String chr){
        this.cur_state = String.format("%s достал %s из %s", this.name, chr, place);
    }
    @Override
    public void believe(){
        this.setState(" ему охотно"+ Actions.BELIEVE);
    }
    @Override
    public void fire(){
        this.setState(Actions.FIRED + " от желания" + Actions.KNOW + " как");
    }

}