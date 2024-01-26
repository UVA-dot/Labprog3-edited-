import Classes.*;
import Enums.Intruders;
import Enums.Places;
import Exceptions.IQBelowZeroException;
import Exceptions.NobodyMetException;
import Interfaces.StringSentence;

public class Main {
    public static void main(String[] args) throws IQBelowZeroException, NobodyMetException {
            StringSentence transformer = s -> {
                    String newString = s.substring(0, 1).toUpperCase() + s.substring(1) + ".";
                    return newString;
            };
            Baby p1 = new Baby(){
                    @Override
                    public void sendSomeone(String chr, Places place){
                            if (place == Places.HOME){
                                    this.cur_state = String.format("Отправлять %s из %s - Безобразие", chr, place);
                            }
                            else {
                                    this.cur_state = String.format("Отправлять %s из %s можно", chr, place);
                            }
                    }
            };
            Karlson p3 = new Karlson();
            Bimbo p2 = new Bimbo();
            Cheloveck p4 = new Cheloveck();
            Freken p5 = new Freken();
            Cheloveck.FilleandRulle p6 = new Cheloveck.FilleandRulle();
            p1.GetSmarter(0);
            String newString1 = transformer.StringTransformer(p1.getState());
            System.out.println(newString1);
            p1.sendSomeone("Бимбо", Places.HOME);
            String newString2 = transformer.StringTransformer(p1.getState());
            System.out.println(newString2);
            String newString16 = transformer.StringTransformer(p6.probablymeet("лающую собаку"));
            System.out.println(newString16);
            p1.takeSomeone(Places.BASKET, "Бимбо");
            String newString17 = transformer.StringTransformer(p1.getState());
            System.out.println(newString17);
            p3.run(Places.HOME);
            String newString20 = transformer.StringTransformer(p3.getState());
            System.out.println(newString20);
            p1.laugh();
            String newString15 = transformer.StringTransformer(p1.getState());
            System.out.println(newString15);
            p1.know();
            String newString3 = transformer.StringTransformer(p1.getState());
            System.out.println(newString3);
            p2.know();
            String newString4 = transformer.StringTransformer(p2.getState());
            System.out.println(newString4);
            p4.know();
            String newString5 = transformer.StringTransformer(p4.getState());
            System.out.println(newString5);
            p3.lie(Places.SOFA);
            String newString6 = transformer.StringTransformer(p3.getState());
            System.out.println(newString6);
            p3.let(p2);
            String newString7 = transformer.StringTransformer(p3.getState());
            System.out.println(newString7);
            p2.scare(Intruders.FILLE, Intruders.RULLE);
            String newString8 = transformer.StringTransformer(p2.getState());
            System.out.println(newString8);
            p3.doit();
            String newString9 = transformer.StringTransformer(p3.getState());
            System.out.println(newString9);
            p3.inspire(p1);
            String newString10 = transformer.StringTransformer(p3.getState());
            System.out.println(newString10);
            p1.believe();
            String newString11 = transformer.StringTransformer(p1.getState());
            System.out.println(newString11);
            p1.fire();
            String newString12 = transformer.StringTransformer(p1.getState());
            System.out.println(newString12);
            p3.tame(p1);
            String newString13 = transformer.StringTransformer(p3.getState());
            System.out.println(newString13);
            String newString18 = transformer.StringTransformer(p6.probablymeet("Карлсона"));
            System.out.println(newString18);
            p3.run(Places.KITCHEN);
            String newString21 = transformer.StringTransformer(p3.getState());
            System.out.println(newString21);
            p5.sleep(Places.BESIDETHEWALL);
            String newString14 = transformer.StringTransformer(p5.getState());
            System.out.println(newString14);
            p3.addSnores("брр-пс-пс");
            p3.addSnores("грр-о-го");
            p3.addSnores("грр-ах-ах");
            p3.rememberSnores();
            String newString19 =  transformer.StringTransformer(p3.getState());
            System.out.println(newString19);
        }
}