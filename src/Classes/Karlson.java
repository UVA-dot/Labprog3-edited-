import Enums.Actions;
import Enums.Endings;
import Enums.Places;
import Interfaces.Doable;
import Interfaces.Inspirable;
import Interfaces.Letable;
import Interfaces.Liable;

public class Karlson extends Character implements Inspirable, Letable, Liable, Doable, Tameable{
    Karlson(String name){
        super(name);
        this.name = name;
    }
    @Override
    public void inspire(Character chr) {
        setState(Actions.INSPIRE.toString() + ' ' + chr.getName() + Endings.Y.toString() + " что так лучше.");
    }
    @Override
    public void let(Character chr){
        setState(Actions.LET.toString() + " " +chr.getName()  +  " возможность ");
    }

    @Override
    public void lie(Places place){
        setState(Endings.Y.toString() + " лучше" +  Actions.LIE.toString() + " " + place.toString() + " " + Places.HOME.toString() + " " + Places.ROOF.toString() + ". ");
    }
    @Override
    public void doit(){
        setState(Actions.DONE.toString() + " всё наоборот");
    }
    @Override
    public void tame(Character chr){
        setState(" и " + chr.getName() + " будут" + Actions.TAME.toString());
    }
}