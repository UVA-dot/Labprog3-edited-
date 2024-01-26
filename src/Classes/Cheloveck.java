package Classes;
import Exceptions.NobodyMetException;
import Interfaces.*;
import Enums.*;
import Abstract.Character;

public class Cheloveck extends Character implements Knowable, NameGetter {
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
        setState(" должен был" + Actions.KNOW + " что");
    }
    public static class FilleandRulle{
        public static String name1 = "Филле и Рулле";
        public String probablymeet(String chr) throws NobodyMetException {
            if (chr != "") {
                return String.format("%s могут встретить %s", this.name1, chr);
            }
            else {
                throw  new NobodyMetException(String.format("%s никого не могут встретить", this.name1));
            }
        }
    }

}