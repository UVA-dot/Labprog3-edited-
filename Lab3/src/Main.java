import Classes.Baby;
import Classes.Bimbo;
import Classes.Cheloveck;
import Classes.Karlson;
import Enums.Intruders;
import Enums.Places;

public class Main {
    public static void main(String[] args) {
            Baby p1 = new Baby();
            Karlson p3 = new Karlson();
            Bimbo p2 = new Bimbo();
            Cheloveck p4 = new Cheloveck();
            p1.laugh();
            System.out.println(p1.getState());
            p1.know();
            System.out.println(p1.getState());
            p2.know();
            System.out.println(p2.getState());
            p4.know();
            System.out.println(p4.getState());
            p3.lie(Places.SOFA);
            System.out.println(p3.getState());
            p3.let(p2);
            System.out.println(p3.getState());
            p2.scare(Intruders.FILLE, Intruders.RULLE);
            System.out.println(p2.getState());
            p3.doit();
            System.out.println(p3.getState());
            p3.inspire(p1);
            System.out.println(p3.getState());
            p1.believe();
            System.out.println(p1.getState());
            p1.fire();
            System.out.println(p1.getState());
            p3.tame(p1);
            System.out.println(p3.getState());
        }
}