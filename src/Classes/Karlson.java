package Classes;

import Enums.Actions;
import Enums.Endings;
import Enums.Places;
import Interfaces.*;
import Abstract.Character;

import java.util.ArrayList;

public class Karlson extends Character implements Inspirable, Letable, Liable, Doable, Tameable, NameGetter {
    private ArrayList<Snore> snores = new ArrayList<>();

    public Karlson() {
        this.name = "Карлсон";
        this.age = 35;
        this.place = Places.HOME;
    }

    public Karlson(String name) {
        super(name);
    }

    public Karlson(String name, int age) {
        super(name, age);
    }

    public Karlson(String name, int age, Places place) {
        super(name, age);
        this.place = place;
    }

    @Override
    public void inspire(Character chr) {
        setState(Actions.INSPIRE + " " + chr.getName() + Endings.Y + " что так лучше");
    }

    public void let(Character chr) {
        setState(Actions.LET + " " + chr.getName() + " возможность");
    }

    @Override
    public void lie(Places place) {
        setState(Endings.Y + " лучше" + Actions.LIE + " " + place.toString() + " в " + Places.HOME + " " + Places.ROOF);
        this.place = place;
    }

    @Override
    public void doit() {
        setState(Actions.DONE + " всё наоборот");
    }

    @Override
    public void tame(Character chr) {
        setState(" и " + chr.getName() + " будут" + Actions.TAME);
    }

    public void rememberSnores() {
        if (this.snores.size() >= 3) {
            this.cur_state = String.format("Запомнить все эти храпы, пожалуй, труднее, чем выучить таблицу умножения Как легко спутать все эти %s но он постарается изо всех сил не ошибиться", this.snores);
        }
        else{
            this.cur_state = String.format("Запомнить все храпы было просто");
        }
    }
    public void run(Places place){
        this.cur_state = String.format("%s побежал в %s", this.name, place);
    }
    public void addSnores(String t) {
        snores.add(new Snore(t));
    }

    class Snore {
        private String type;

        Snore(String t) {
            type = t;
        }

        @Override
        public String toString() {
            return type;
        }
    }
}