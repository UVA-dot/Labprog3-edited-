package Classes;
import Abstract.Character;
import Enums.Actions;
import Enums.Places;
import Interfaces.*;

public class Freken extends Character implements NameGetter, Sleepable{
    private Places place;
    public Freken(){
        this.name = "Фрекен Бок";
        this.age = 59;
        this.place = Places.INROOM;
    }

    public Freken(String name){
        super(name);
    }
    public Freken(String name, int age){
        super(name, age);
    }
    public Freken(String name, int age, Places place){
        super(name, age);
        this.place = place;
    }
    public void sleep(Places place){
        this.cur_state = (String.format("%s %s %s %s", this.name, Actions.SLEEP, this.place, place.toString()));
    }

}