package Classes;
import Enums.Places;
import Interfaces.*;
import Enums.*;
import Classes.*;
import Abstract.Character;

public class Cheloveck extends Character implements Knowable {
    public Cheloveck(){
        this.name = "Каждый человек";
    }
    public Cheloveck(String name){
        super(name);
    }
    public Cheloveck(String name, int age){
        super(name, age);
    }
    public void know(){
        setState(" должен был" + Actions.KNOW + " что ");
    }
}