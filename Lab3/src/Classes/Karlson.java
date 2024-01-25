package Classes;

import Enums.Actions;
import Enums.Endings;
import Enums.Places;
import Interfaces.*;
import Enums.*;
import Classes.*;
import Abstract.Character;

public class Karlson extends Character implements Inspirable, Letable, Liable, Doable, Tameable {
    public Places place1;
    public Karlson(){
        this.name = "Карлсон";
        this.age = 35;
        this.place1 = Places.HOME;
    }
    public Karlson(String name){
        super(name);
    }
    public Karlson(String name, int age){
        super(name, age);
    }
    public Karlson(String name, int age, Places place){
        super(name, age);
        this.place1 = place;
    }
    @Override
    public void inspire(Character chr) {
        setState(Actions.INSPIRE + " " + chr.getName() + Endings.Y + " что так лучше");
    }
    public void let(Character chr){
        setState(Actions.LET + " " +chr.getName()  +  " возможность ");
    }

    @Override
    public void lie(Places place){
        setState(Endings.Y + " лучше" +  Actions.LIE + " " + place.toString() + " " + Places.HOME + " " + Places.ROOF + " ");
        this.place1 = place;
    }
    @Override
    public void doit(){
        setState(Actions.DONE + " всё наоборот");
    }
    @Override
    public void tame(Character chr){
        setState(" и " + chr.getName() + " будут" + Actions.TAME);
    }
}